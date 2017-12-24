package com.lumeresoftware.orangeforum.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.
            authorizeRequests()
                .antMatchers("/", "/index").permitAll()
                .anyRequest()
                    .fullyAuthenticated()
            .and()
                .formLogin()
                    .loginPage("/login")
                        .failureUrl("/login?error")
                .permitAll()
            .and()
                .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/login")
            .and()
                .csrf().disable();
        // @formatter:on
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //TODO remove this
        // @formatter:off
        auth
            .inMemoryAuthentication()
            .withUser("user").password("password").roles("USER");
        // @formatter:on
    }
}