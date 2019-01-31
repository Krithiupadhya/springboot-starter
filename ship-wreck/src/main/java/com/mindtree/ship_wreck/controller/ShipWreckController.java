package com.mindtree.ship_wreck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ship_wreck.model.Shipwreck;
import com.mindtree.ship_wreck.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@GetMapping("shipwrecks")
	public List<Shipwreck> list (){
		return shipwreckRepository.findAll();
	}
	
}
