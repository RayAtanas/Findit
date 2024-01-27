package finditspring.findit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"Controller", "Model", "Service"})
@EnableMongoRepositories(basePackages = {"Repository"})
public class FinditApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinditApplication.class, args);
	}
}
