package org.revo.task.Views;

import org.revo.task.Domain.RegionsEntity;
import org.revo.task.Repository.RegionsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegionViews {
    @Autowired
    public RegionsEntityRepository regionsEntityRepository;

    @GetMapping("/region")
    public ModelAndView index() {
        return new ModelAndView("region/index")
                .addObject("regions", regionsEntityRepository.findAll());
    }

    @GetMapping("/region/update/{id}")
    public ModelAndView updatePage(@PathVariable Integer id) {
        return new ModelAndView("region/update")
                .addObject("region", regionsEntityRepository.findOne(id))
                ;
    }

    @PostMapping("/region/update/{id}")
    public ModelAndView update(@PathVariable Integer id, @ModelAttribute RegionsEntity regionsEntity) {
        regionsEntity.setRegionId(id);
        regionsEntityRepository.save(regionsEntity);
        return new ModelAndView("region/update")
                .addObject("region", regionsEntityRepository.findOne(id))
                ;
    }
}
