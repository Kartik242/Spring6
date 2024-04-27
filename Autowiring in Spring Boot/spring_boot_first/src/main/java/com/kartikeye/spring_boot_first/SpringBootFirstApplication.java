package com.kartikeye.spring_boot_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

		// implementing that spring will provide us the alien object i.e DI
		Alien obj = context.getBean(Alien.class);
		obj.code();

	}

}
