package org.revo.task.Views;

import org.revo.task.Domain.CountriesEntity;
import org.revo.task.Repository.CountriesEntityRepository;
import org.revo.task.Repository.RegionsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryViews {
    @Autowired
    public CountriesEntityRepository countriesEntityRepository;
    @Autowired
    public RegionsEntityRepository regionsEntityRepository;

    @GetMapping("/country")
    public ModelAndView index() {
        return new ModelAndView("country/index")
                .addObject("countries", countriesEntityRepository.findAll());
    }

    @GetMapping("/country/update/{id}")
    public ModelAndView updatePage(@PathVariable String id) {
        return new ModelAndView("country/update")
                .addObject("country", countriesEntityRepository.findOne(id))
                .addObject("regions", regionsEntityRepository.findAll())
                ;
    }

    @PostMapping("/country/update/{id}")
    public ModelAndView update(@PathVariable String id, @ModelAttribute CountriesEntity countriesEntity) {
        countriesEntity.setCountryId(id);
        countriesEntityRepository.save(countriesEntity);
        return new ModelAndView("country/update")
                .addObject("country", countriesEntityRepository.findOne(id))
                .addObject("regions", regionsEntityRepository.findAll())
                ;
    }
}
