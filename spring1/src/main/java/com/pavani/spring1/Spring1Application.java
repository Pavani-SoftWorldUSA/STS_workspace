package com.pavani.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring1Application.class, args);
		
	Alien a = context.getBean(Alien.class);
	a.show();
		
//	Alien a1 = context.getBean(Alien.class);
//	a1.show();
//	
		System.out.println("WELCOME TO SPRINGBOOT");
	}

}
