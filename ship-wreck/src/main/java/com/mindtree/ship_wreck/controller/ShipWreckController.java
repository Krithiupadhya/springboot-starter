package com.mindtree.ship_wreck.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.ship_wreck.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

	@GetMapping("shipwrecks")
	public List<Shipwreck> list (){
		return ShipwreckStub.list();
	}
	
}
