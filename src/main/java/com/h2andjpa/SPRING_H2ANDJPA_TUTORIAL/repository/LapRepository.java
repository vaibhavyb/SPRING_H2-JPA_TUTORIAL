package com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.repository;

import org.springframework.data.repository.CrudRepository;

import com.h2andjpa.SPRING_H2ANDJPA_TUTORIAL.model.Laptop;


public interface LapRepository extends CrudRepository<Laptop,Integer>{

}
