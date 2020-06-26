package com.mytoshika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class App 
{

	public static void main( String[] args ) {
		SpringApplication.run(App.class, args);

	}

	@Autowired
	public void setEnv(Environment e) {
		System.out.println(e.getProperty("config.server.url"));
		System.out.println(e.getProperty("registery.server.url"));
	}
}
