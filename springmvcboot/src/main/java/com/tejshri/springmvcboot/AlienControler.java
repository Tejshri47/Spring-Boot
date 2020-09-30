package com.tejshri.springmvcboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AlienControler {
	
	@Autowired
	AlienRepo repo;
	@ResponseBody
	@GetMapping("aliens" )
	public List<Alien>getAliens() {
		List<Alien> aliens= repo.findAll();
		return aliens;
		
	}
	@ResponseBody
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable("aid") int aid) {
		
		Alien alien=repo.findById(aid).orElse(new Alien(0,""));
		
		return alien;
		
	}
@ResponseBody
	@PostMapping("alien")
	public Alien addAlien( Alien alien) {
		repo.save(alien);
		return alien;
		
		
	}
}
