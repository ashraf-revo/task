package org.revo.task.Controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeToken;
import org.revo.task.Domain.DepartmentsEntity;
import org.revo.task.Domain.EmployeesEntity;
import org.revo.task.Repository.DepartmentsEntityRepository;
import org.revo.task.Repository.EmployeesEntityRepository;
import org.revo.task.Domain.employeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController()
@RequestMapping("api/employees")
public class EmployeeApiController {
    @Autowired
    public EmployeesEntityRepository employeesEntityRepository;
    @Autowired
    public DepartmentsEntityRepository departmentsEntityRepository;

    @PostMapping(value = "list", params = {"firstname"})
    public List<employeeDTO> list(@RequestParam String firstname) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new PropertyMap<EmployeesEntity, employeeDTO>() {
            @Override
            protected void configure() {
                String departmentName = source.getDepartmentId().toString();
                map().setDepartmentName(departmentName);
            }
        });


        List<employeeDTO> map = modelMapper.map(employeesEntityRepository.findByFirstName(firstname), new TypeToken<List<employeeDTO>>() {
        }.getType());
        return map.stream().map(it -> {
            DepartmentsEntity one = departmentsEntityRepository.findOne(Integer.valueOf(it.getDepartmentName()));
            if (one != null) it.setDepartmentName(one.getDepartmentName());
            return it;
        }).collect(toList());

    }

    @GetMapping(value = "list")
    public List<EmployeesEntity> listAll() {
        return employeesEntityRepository.findAll();

    }

}
