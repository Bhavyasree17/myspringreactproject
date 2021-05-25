package com.project.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.user.dao.*;
import com.project.user.model.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class usercontroller {
	
	@Autowired
	userrepository userrepo;
	
	@GetMapping("/userslist")
	public List<user> listOfUsers() {
		
		return userrepo.findAll();	
	}
}