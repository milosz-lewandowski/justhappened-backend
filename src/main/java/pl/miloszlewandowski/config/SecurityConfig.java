package pl.miloszlewandowski.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authMenager) throws Exception{
        authMenager.inMemoryAuthentication().withUser("user").password("password").roles("PATIENT");
    }
}
