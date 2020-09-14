package com.tejshri.springmvcpract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String home() {
		return "welcome.jsp";
	}
	
    @RequestMapping("calculator")
	public ModelAndView calculator(@RequestParam ("num1")int i,@RequestParam ("num2")int j,@RequestParam ("op")String k) {
		int num3=0;
   ModelAndView mv=new ModelAndView();
	//mv.setViewName("result.jsp");
	
	if(k.equals("+")) {
	 num3=i+j;
	
	}
	else if(k.equals("-")){
		 num3=i-j;
		}
	else if(k.equals("*")){
		 num3=i*j;
	}
	else if(k.equals("/")) {
		num3=i/j;
	}
	else if(k.equals("%")) {
		num3=i*100/j;
	}
	
	mv.setViewName("result.jsp");
	mv.addObject("num3",num3);
	return mv;
	
    }
   
    		
    	
    	
    }
    
    
    	
    	
    

