package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //This is an annotation that signifies it is a Spring Boot Application 

/*
 @SpringBootApplication is a composite annotation that combines the following three annotations:
 		@SpringBootConfiguration - Designates this class as a configuration class. 
 		@EnableAutoConfiguration - Enables the Spring Boot automatic configuration.
 		@ComponentScan - Enables component scanning. This lets you declare other classes with annotations like @Component, @Controller and @Service to have Spring automatically discover and register them as components in the Spring application context.
 */ 
public class TacoCloudChp01Application {

	public static void main(String[] args) { //Calls a static run() method on the SpringApplication class. The two parameters passed to the run() method are a configuration class and the command-line arguments
		SpringApplication.run(TacoCloudChp01Application.class, args); //Runs the application 
	}

}
