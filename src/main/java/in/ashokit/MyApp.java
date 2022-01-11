package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyApp.class, args);

		UserService us = context.getBean(UserService.class);

		us.save();

	}

}
