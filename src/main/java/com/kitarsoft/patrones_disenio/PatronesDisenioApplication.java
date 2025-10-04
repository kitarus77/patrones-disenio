package com.kitarsoft.patrones_disenio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PatronesDisenioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDisenioApplication.class, args);
	}

}
