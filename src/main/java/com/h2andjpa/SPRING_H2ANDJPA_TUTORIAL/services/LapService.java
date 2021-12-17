package com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.model.Laptop;
import com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.repository.LapRepository;

@Service
public class LapService {

	@Autowired
	LapRepository lapRepository;
	
	public List<Laptop> getlaptops() {
		List<Laptop> laptops=new ArrayList<>();
		lapRepository.findAll().forEach(laptops::add);
		return laptops;
	
	}

	public void addlaptop(Laptop laptop) {
		lapRepository.save(laptop);
		
	}
	

}
