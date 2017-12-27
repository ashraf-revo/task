package org.revo.task.Views;

import org.revo.task.Domain.JobHistoryEntity;
import org.revo.task.Repository.DepartmentsEntityRepository;
import org.revo.task.Repository.JobHistoryEntityRepository;
import org.revo.task.Repository.JobsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;


@Controller
public class JobHistoryViews {
    @Autowired
    public JobsEntityRepository jobsEntityRepository;
    @Autowired
    public JobHistoryEntityRepository jobHistoryEntityRepository;
    @Autowired
    public DepartmentsEntityRepository departmentsEntityRepository;

    @GetMapping("/jobhistory")
    public ModelAndView index() {
        return new ModelAndView("jobhistory/index")
                .addObject("jobhistories", jobHistoryEntityRepository.findAll());
    }

    @GetMapping("/jobhistory/update/{id1}/{id2}")
    public ModelAndView updatePage(@PathVariable("id1") Integer id1, @PathVariable("id2") long id2) {
        return new ModelAndView("jobhistory/update")
                .addObject("jobhistory", jobHistoryEntityRepository.findByEmployeeIdAndStartDate(id1,  new Date(id2)))
                .addObject("jobs", jobsEntityRepository.findAll())
                .addObject("departments", departmentsEntityRepository.findAll())
                ;
    }

    @PostMapping("/jobhistory/update/{id1}/{id2}")
    public ModelAndView update(@PathVariable("id1") Integer id1, @PathVariable("id2") long id2, @ModelAttribute JobHistoryEntity jobHistoryEntity) {
        jobHistoryEntityRepository.update(id1,new Date(id2),jobHistoryEntity.getEndDate(),jobHistoryEntity.getJobId(),jobHistoryEntity.getDepartmentId());
        return new ModelAndView("jobhistory/update")
                .addObject("jobhistory", jobHistoryEntityRepository.findByEmployeeIdAndStartDate(id1, new Date(id2)))
                .addObject("jobs", jobsEntityRepository.findAll())
                .addObject("departments", departmentsEntityRepository.findAll())
                ;
    }
}
