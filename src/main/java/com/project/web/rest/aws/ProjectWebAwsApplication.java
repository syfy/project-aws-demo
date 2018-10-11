package com.project.web.rest.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.project.web.domains")
@EnableJpaRepositories("com.project.web.repository")
@ComponentScan({"com.project.web.controllers","com.project.web.domains","com.project.web.repository","com.project.web.rest.aws"})

public class ProjectWebAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectWebAwsApplication.class, args);
	}
}
