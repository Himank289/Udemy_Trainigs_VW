//package vw.him.springboot_security.config;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		List<SimpleGrantedAuthority> roles=null;
//		if(username.contains("admin"))
//		{
//		roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
//		return new User("admin", "$2a$12$Zlh2EkASo3ubzwbnFf1IrOk9IlATYnCFqDQUf1pC9ffZhIni2Ts6i",
//					roles);
//		}
//		else if(username.contains("user"))
//		{
//		roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//		return new User("user", "$2a$12$ccT8193pgHlQMV/zj1zPEetn9qWdu1H6W5QCYZAnrwalYspQzfO92",
//					roles);
//		}
//		throw new UsernameNotFoundException("User not found with username: " + username);
//	}
//
//}
//
