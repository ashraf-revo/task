package org.revo.task.Views;

import org.revo.task.Domain.EmployeesEntity;
import org.revo.task.Repository.DepartmentsEntityRepository;
import org.revo.task.Repository.EmployeesEntityRepository;
import org.revo.task.Repository.JobsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeViews {
    @Autowired
    public EmployeesEntityRepository employeesEntityRepository;
    @Autowired
    public DepartmentsEntityRepository departmentsEntityRepository;
    @Autowired
    public JobsEntityRepository jobsEntityRepository;

    @GetMapping("/employee")
    public ModelAndView index() {
        return new ModelAndView("employee/index")
                .addObject("employees", employeesEntityRepository.findAll());
    }

    @GetMapping("/employee/update/{id}")
    public ModelAndView updatePage(@PathVariable Integer id) {
        return new ModelAndView("employee/update")
                .addObject("employee", employeesEntityRepository.findOne(id))
                .addObject("employees", employeesEntityRepository.findAll())
                .addObject("departments", departmentsEntityRepository.findAll())
                .addObject("jobs",jobsEntityRepository.findAll())
                ;
    }

    @PostMapping("/employee/update/{id}")
    public ModelAndView update(@PathVariable Integer id, @ModelAttribute EmployeesEntity employeesEntity) {
        employeesEntity.setEmployeeId(id);
        employeesEntityRepository.save(employeesEntity);
        return new ModelAndView("employee/update")
                .addObject("employee", employeesEntityRepository.findOne(id))
                .addObject("employees", employeesEntityRepository.findAll())
                .addObject("departments", departmentsEntityRepository.findAll())
                .addObject("jobs",jobsEntityRepository.findAll())
                ;
    }
}
