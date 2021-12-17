package com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.model.Laptop;
import com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.services.LapService;

@RestController
public class LapController {

	@Autowired
	LapService lapService;

	@GetMapping("/laptops")
	public List<Laptop> getlaptop() {
		return lapService.getlaptops();
	}
	
	@PostMapping("/laptops")
	public void addlaptop(@RequestBody Laptop laptop) {
		lapService.addlaptop(laptop);
		
	}

}
