package com.example.springaop;

import com.example.springaop.business.Business1;
import com.example.springaop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger=  LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Business1 b1;

	@Autowired
	private Business2 b2;
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(b1.calculateSomething());
		logger.info(b2.calculateSomething());
	}
}
