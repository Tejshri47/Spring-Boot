
package com.tejshri.springmvcboot;

import java.util.Arrays;

import java.util.List;

import javax.servlet.http.HttpServlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeControler {
	@Autowired
	AlienRepo repo;
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("a1", "Aliens");
		
	}
	@RequestMapping("/")
	public  String home() {
		return "index";
	
	}
	@RequestMapping("add")
	public String  add( @RequestParam("num1")int i,@RequestParam ("num2")int j ,Model m){
		//ModelAndView mv=new ModelAndView();
			
		int num3=i+j;
		m.addAttribute("num3",num3);
		return "result";
		
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		m.addAttribute("result",repo.findAll());
		return "show";
		
	}
	@GetMapping ( "getAlien")
	public String getAlien(@RequestParam int aid ,Model m) {
//		List<Alien> alien= Arrays.asList(new Alien(101,"tejshri"),new Alien(102,"ritesh"));
		m.addAttribute("result",repo.getOne(aid));
		return "show";
		
	}
	@GetMapping ( "getAlienByName")
	public String getAlien(@RequestParam String aname ,Model m) {
//		List<Alien> alien= Arrays.asList(new Alien(101,"tejshri"),new Alien(102,"ritesh"));
		m.addAttribute("result",repo.findByAname(aname));
		return "show";
		
	}
	@PostMapping( value="addAlien")
	public String addAlien( @ModelAttribute Alien a) {
	repo.save(a);
	return "result";
}
}
