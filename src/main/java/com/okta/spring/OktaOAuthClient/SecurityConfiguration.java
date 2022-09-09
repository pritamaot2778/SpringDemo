package com.okta.spring.OktaOAuthClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	private static final Logger logger = LogManager.getLogger(SecurityConfiguration.class);
	
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	logger.info("SecurityConfiguration : configure");
        http.antMatcher("/**").authorizeRequests()
            .antMatchers("/").permitAll()
            .anyRequest().authenticated()
            .and()
            .oauth2Login();
    }
}