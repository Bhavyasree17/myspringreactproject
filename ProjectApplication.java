package com.project.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.project.user.dao.*;
import com.project.user.model.*;


@SpringBootApplication
@ComponentScan("com.project.user.controller")
public class ProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Autowired
	userrepository userrepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		userrepo.save(new user("virat", "kohli", "viratkohli@gmail.com"));
		userrepo.save(new user("ms", "dhoni", "msdhoni132@gmail.com"));
		userrepo.save(new user("shreyas", "iyer", "shreyasiyer@gmail.com"));
		userrepo.save(new user("Sachin", "Tendulkar", "rummy123@gmail.com"));
	}

}
