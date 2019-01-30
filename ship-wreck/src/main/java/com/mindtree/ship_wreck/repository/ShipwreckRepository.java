package com.mindtree.ship_wreck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.ship_wreck.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
