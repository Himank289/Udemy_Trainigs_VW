package vw.him.springboot_security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ResourceController {
	
	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/normal")
	public String helloUser(){
		return "Hello i am normal user";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String helloAdmin(){
		return "Hello i am Admin";
	}
	
	@GetMapping("/public")
	public String helloPublic(){
		return "Hello i am Public";
	}

}
