package com.kayaTech.Security;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   
    
   
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		    .authorizeRequests()
		    .anyRequest()
		    .authenticated();
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		
		List<UserDetails> users = new ArrayList<>();
		
		users.add(User
				.builder()
				.username("user")
				.password("user")
				.roles("user")
				.build());
		
		users.add(User
				.builder()
				.username("user1")
				.password("user1")
				.roles("user")
				.build());
	
		return new InMemoryUserDetailsManager(users);
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
}
