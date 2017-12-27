package org.revo.task.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login", "/webjars/**","/api/**").permitAll()
                .antMatchers("/country/**").hasAnyRole("Sales","Administration")
                .antMatchers("/department/**").hasAnyRole("Administration")
                .antMatchers("/employee/**").hasAnyRole("Accounting", "Finance", "Administration")
                .antMatchers("/jobhistory/**").hasAnyRole("Administration")
                .antMatchers("/job/**").hasAnyRole("Accounting", "Finance","Administration")
                .antMatchers("/location/**").hasAnyRole("Sales","Administration")
                .antMatchers("/region/**").hasAnyRole("Sales","Administration")
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .and().exceptionHandling().accessDeniedPage("/403")
                .and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }


}
