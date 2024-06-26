package com.santosh.springboot.dbwithJPA.springbootProJPAwithMySql;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBOperationRunner implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository eRepo;
	
	@Override
	public void run(String...args) throws Exception {
		
		eRepo.saveAll(Arrays.asList(
				new Employee(101, "Meghna", "QA", 1500.00d),
				new Employee(102, "Akshay", "Hr", 500.00d),
				new Employee(103, "Priti", "Training", 1500.00d),
				new Employee(104, "Jignesh", "HR", 1500.00d),
				new Employee(105, "Sneha", "QA", 1500.00d)
				));
		System.out.println("-----------All Data Saved in Database----------");
		

	
	}
	

}