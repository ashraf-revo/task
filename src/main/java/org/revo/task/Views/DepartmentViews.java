package org.revo.task.Views;

import org.revo.task.Domain.DepartmentsEntity;
import org.revo.task.Repository.DepartmentsEntityRepository;
import org.revo.task.Repository.EmployeesEntityRepository;
import org.revo.task.Repository.LocationsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentViews {
    @Autowired
    public DepartmentsEntityRepository departmentsEntityRepository;
    @Autowired
    public LocationsEntityRepository locationsEntityRepository;
    @Autowired
    public EmployeesEntityRepository employeesEntityRepository;

    @GetMapping("/department")
    public ModelAndView index() {
        return new ModelAndView("department/index")
                .addObject("departments", departmentsEntityRepository.findAll());
    }

    @GetMapping("/department/update/{id}")
    public ModelAndView updatePage(@PathVariable Integer id) {
        return new ModelAndView("department/update")
                .addObject("department", departmentsEntityRepository.findOne(id))
                .addObject("locations", locationsEntityRepository.findAll())
                .addObject("employees", employeesEntityRepository.findAll())
                ;
    }

    @PostMapping("/department/update/{id}")
    public ModelAndView update(@PathVariable Integer id, @ModelAttribute DepartmentsEntity departmentsEntity) {
        departmentsEntity.setDepartmentId(id);
        departmentsEntityRepository.save(departmentsEntity);
        return new ModelAndView("department/update")
                .addObject("department", departmentsEntityRepository.findOne(id))
                .addObject("locations", locationsEntityRepository.findAll())
                .addObject("employees", employeesEntityRepository.findAll())
                ;
    }
}
