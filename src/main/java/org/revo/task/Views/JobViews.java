package org.revo.task.Views;

import org.revo.task.Domain.JobsEntity;
import org.revo.task.Repository.JobsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobViews {
    @Autowired
    public JobsEntityRepository jobsEntityRepository;

    @GetMapping("/job")
    public ModelAndView index() {
        return new ModelAndView("job/index")
                .addObject("jobs", jobsEntityRepository.findAll());
    }

    @GetMapping("/job/update/{id}")
    public ModelAndView updatePage(@PathVariable String id) {
        return new ModelAndView("job/update")
                .addObject("job", jobsEntityRepository.findOne(id))
                ;
    }

    @PostMapping("/job/update/{id}")
    public ModelAndView update(@PathVariable String id, @ModelAttribute JobsEntity jobsEntity) {
        jobsEntity.setJobId(id);
        jobsEntityRepository.save(jobsEntity);
        return new ModelAndView("job/update")
                .addObject("job", jobsEntityRepository.findOne(id))
                ;
    }
}
