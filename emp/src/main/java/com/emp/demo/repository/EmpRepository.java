package com.emp.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.demo.entity.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> employee = new ArrayList<Employee>();

	public static   List<Employee> getAll() {
		return employee;
	}

	public static  String add(Employee emp) {
		employee.add(emp);
		return "Succesfully added";
	}

	public static String edit(Employee emp) {
		employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
			e.setAddress(emp.getAddress());
			e.setName(emp.getName());
		});
		return "Successful Updated";
	}

	public static String delete(int empNo) {
		employee.remove(empNo-1);
		return "Deleted";
	}

}



