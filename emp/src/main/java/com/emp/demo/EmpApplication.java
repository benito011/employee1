package com.emp.demo;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.demo.entity.Employee;
import com.emp.demo.repository.EmpRepository;

@SpringBootApplication

public class EmpApplication implements CommandLineRunner{
	
	@Autowired
	 EmpRepository emprepository ;

	public static void main(String[] args) {
		SpringApplication.run(EmpApplication.class, args);
		
	}
 
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1, "Bat Man", "Bat Cave");
		Employee e2 = new Employee(2, "Super Man", "Kaipton");
		
//		emprepository.Employee.addAll(Arrays.asList(e1, e2));
		emprepository.employee.addAll(Arrays.asList(e1, e2));
	}
		

}
