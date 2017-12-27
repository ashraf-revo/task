package org.revo.task.Config;

import org.revo.task.Repository.DepartmentsEntityRepository;
import org.revo.task.Repository.EmployeesEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UtilConfig {
    @Autowired
    public EmployeesEntityRepository employeesEntityRepository;
    @Autowired
    public DepartmentsEntityRepository departmentsEntityRepository;

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return s -> employeesEntityRepository
                .findByEmail(s)
                .map(it -> new User(it, departmentsEntityRepository.findOne(it.getDepartmentId())))
                .orElseThrow(() -> new UsernameNotFoundException(s + " not found "));
    }

}
