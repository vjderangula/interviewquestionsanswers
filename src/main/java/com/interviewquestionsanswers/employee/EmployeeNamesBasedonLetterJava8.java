package com.interviewquestionsanswers.employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeNamesBasedonLetterJava8 {

	
	    
	    public static void main(String[] args) {
	        // Example list of employees
	        List<Employee1> employees = List.of(
	                new Employee1(1, "John"),
	                new Employee1(2, "Alice"),
	                new Employee1(3, "Bob"),
	                new Employee1(4, "Amanda")
	        );

	        // Sort employees based on the presence of letter 'A' in name in descending order using Stream API
	        List<Employee1> sortedEmployees = employees.stream()
	                .sorted(Comparator.comparing(employee -> ((Employee1) employee).getName().contains("A")).reversed())
	                .toList();

	        // Print sorted employees
	        sortedEmployees.forEach(employee -> System.out.println(employee.getName()));
	    }

	    // Other methods
	}
class Employee1{
	int id;
	String name;
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

