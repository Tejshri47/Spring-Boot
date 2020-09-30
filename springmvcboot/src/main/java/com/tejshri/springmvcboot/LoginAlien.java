package com.tejshri.springmvcboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
@Component
 public class LoginAlien {
	
	
	private static final Logger LOGGER =LoggerFactory.getLogger(LoginAlien.class);
	@Before(value = "execution (public * com.tejshri.springmvcboot.AlienControler .getAliens())")
	public void  logBefore( ) {
		LOGGER.info("getAlien method is called ");
		
	}
	
	
	//after finally it will be excuted if thrir id any erro in getalien also as it is same as finally exception keyword 
	
	@After(value = "execution(public * com.tejshri.springmvcboot.AlienControler.getAliens())")
	public void logAfter() {
		LOGGER.info("getAlien method excuted ");
	
}
	
	//so if we want when exception occurs above should not executed the we us another annotation i.e, @AfterReturning theis only uted when their is not exception in getAliens() method 
	@AfterReturning(value = "execution(public * com.tejshri.springmvcboot.AlienControler.getAliens())")
	public void logAfterReturning() {
		LOGGER.info("getAlien method excuted in @AfterReturning  ");
	
}
	
	//and if we ant whenever exception occurs then method will show us and their  is exception for that we have to use anotation i.e, @AfterThrowing 
	
	@AfterThrowing(value ="execution( public * com.tejshri.springmvcboot.AlienControler.getAliens())")
	public void logAfterThrowing() {
		LOGGER.info(" their is some issue");
	}
	
}
