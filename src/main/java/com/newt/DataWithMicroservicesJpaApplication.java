package com.newt;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableSwagger2
public class DataWithMicroservicesJpaApplication {
/*@Bean
	InitializingBean seedDatabase(CarRepository carRepo){
		return() -> {
			carRepo.save(new Car("A1","Honda","Civic",1997));
			carRepo.save(new Car("B1","Honda","Accord",1999));
			carRepo.save(new Car("C1","Ford","Escort",2003));
		};
	}*/
/*@Bean
CommandLineRunner retrieveQuery(CarRepository carRepo){
	return args ->
	carRepo.findByMakeIgnoringCase("HONDA").forEach(System.err :: println);
			}
	*/
	public static void main(String[] args) {
		SpringApplication.run(DataWithMicroservicesJpaApplication.class, args);
	}
	
}
