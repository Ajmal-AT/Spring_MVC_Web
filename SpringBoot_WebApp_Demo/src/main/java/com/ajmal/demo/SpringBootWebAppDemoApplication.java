package com.ajmal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootWebAppDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(SpringBootWebAppDemoApplication.class, args);
		System.out.println("hallo");
		HomeController home = cont.getBean(HomeController.class);
		home.home();
	}

}
