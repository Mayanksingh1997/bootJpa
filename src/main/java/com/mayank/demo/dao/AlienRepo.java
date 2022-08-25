package com.mayank.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mayank.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	

}
