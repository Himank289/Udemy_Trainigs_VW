package vw.him.springboot_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SpringSecurityConfiguration{
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
 	public UserDetailsService userDetailsService() {
 		UserDetails normalUser = User.withUsername("normal_user")
 			.password(passwordEncoder().encode("password"))
 			.roles("NORMAL")
 			.build();
 		
 		UserDetails adminUser = User.withUsername("admin")
 			.password(passwordEncoder().encode("password"))
 			.roles("ADMIN")
 			.build();
 		return new InMemoryUserDetailsManager(normalUser, adminUser);
 	}

	

	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
 		http.csrf().disable()
 		.authorizeHttpRequests()
// 		.requestMatchers("/home/admin")
// 		.hasRole("ADMIN")
// 		.requestMatchers("/home/normal")
// 		.hasRole("NORMAL")
 		.requestMatchers("/home/public")
 		.permitAll()
 		.anyRequest()
 		.authenticated()
 		.and()
 		.formLogin();
 		
 		return http.build();

	}

	

}
