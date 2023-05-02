package com.grt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grt.entity.Laptop;
import com.grt.repository.LaptopRepo;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

	@Autowired
	LaptopRepo laptopRepo;
	
	@GetMapping
	public ResponseEntity<List<Laptop>> getLaptops()
	{
		return ResponseEntity.status(HttpStatus.OK).body(laptopRepo.findAll());
	}
	
	@GetMapping("/{l_id}")
	public ResponseEntity<Laptop> getLaptopById(@PathVariable("l_id") int id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(laptopRepo.findById(id).get());
	}
}
