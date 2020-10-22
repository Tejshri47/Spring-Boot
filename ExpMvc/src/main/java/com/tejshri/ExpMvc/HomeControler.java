package com.tejshri.ExpMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejshri.ExpMvc.model.EmpRepo;
import com.tejshri.ExpMvc.model.Employee;

@Controller
public class HomeControler {
	@Autowired
	EmpRepo repo;
	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
	}
	@GetMapping("getbyeid")
	public String getEmpById(@RequestParam int eid ,Model m) {
		m.addAttribute("emp",repo.getOne(eid));
		return "result.jsp";
	}
	@GetMapping("getbyename")
	public String getEmpByName(@RequestParam String ename ,Model m) {
		m.addAttribute("emp",repo.findByEname(ename));
		return "result.jsp";
	}
	
	@PostMapping("addempdetails")
	public String addEmpDetails (@ModelAttribute("emp") Employee emp)  {
		repo.save(emp);
		return "result.jsp";
	}

}
