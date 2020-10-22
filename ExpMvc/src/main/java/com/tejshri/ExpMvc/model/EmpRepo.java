package com.tejshri.ExpMvc.model;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface EmpRepo extends  JpaRepository<Employee,Integer>{
	
	List<Employee>findByEname(String ename);

}
