package com.tejshri.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AlienRepo extends JpaRepository<Alien,Integer>{

	List<Alien> findByAname(String aname);
	
	

}
