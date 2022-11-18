package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"project"})
public class SpringCleanArchitectureTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCleanArchitectureTemplateApplication.class, args);
	}

}
