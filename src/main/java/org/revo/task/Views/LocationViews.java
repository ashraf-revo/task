package org.revo.task.Views;

import io.swagger.models.auth.In;
import org.revo.task.Domain.CountriesEntity;
import org.revo.task.Domain.LocationsEntity;
import org.revo.task.Repository.CountriesEntityRepository;
import org.revo.task.Repository.LocationsEntityRepository;
import org.revo.task.Repository.RegionsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LocationViews {
    @Autowired
    public CountriesEntityRepository countriesEntityRepository;
    @Autowired
    public RegionsEntityRepository regionsEntityRepository;
    @Autowired
    public LocationsEntityRepository locationsEntityRepository;
//
//    @GetMapping("/temp")
//    public ModelAndView temp() {
//
//        return new ModelAndView("temp");
////                .addObject("countries", countriesEntityRepository.findAll());
//    }
//
    @GetMapping("/location")
    public ModelAndView index() {
        return new ModelAndView("location/index")
                .addObject("locations", locationsEntityRepository.findAll());
    }

    @GetMapping("/location/update/{id}")
    public ModelAndView updatePage(@PathVariable Integer id) {
        return new ModelAndView("location/update")
                .addObject("location", locationsEntityRepository.findOne(id))
                .addObject("countries", countriesEntityRepository.findAll())
                ;
    }

    @PostMapping("/location/update/{id}")
    public ModelAndView update(@PathVariable Integer id, @ModelAttribute LocationsEntity locationsEntity) {
        locationsEntity.setLocationId(id);
        locationsEntityRepository.save(locationsEntity);
        return new ModelAndView("location/update")
                .addObject("location", locationsEntityRepository.findOne(id))
                .addObject("countries", countriesEntityRepository.findAll())
                ;
    }
}
