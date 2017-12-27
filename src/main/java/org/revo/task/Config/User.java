package org.revo.task.Config;

import org.revo.task.Domain.DepartmentsEntity;
import org.revo.task.Domain.EmployeesEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class User implements UserDetails {
    private EmployeesEntity employeesEntity;

    private DepartmentsEntity departmentsEntity;

    public User(EmployeesEntity employeesEntity, DepartmentsEntity departmentsEntity) {
        this.employeesEntity = employeesEntity;
        this.departmentsEntity = departmentsEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList("ROLE_"+departmentsEntity.getDepartmentName());
    }

    @Override
    public String getPassword() {
        return employeesEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return employeesEntity.getFirstName() + " " + employeesEntity.getLastName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
