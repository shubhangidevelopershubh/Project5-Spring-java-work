package com.santosh.sms.springbootStudentMgtSysWithJPA;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class AddStudentToDBRunner implements CommandLineRunner {

	@Autowired
	StudentRepository sRepo;
	
	@Override
	public void run(String... args) throws Exception {
		

		sRepo.saveAll(Arrays.asList(
			new Student(101, "Meghna","BCA", "A+", "Female", 4500.00),
			new Student(102, "Ganesh","MCA","O","Male", 5500.00),
			new Student(103, "Arti","MBA","A+", "Female", 2200.00)
			));
		
		
		
		System.out.println("----------------All Student Data Pushed into Database-----------");
		
	}
	

	
}