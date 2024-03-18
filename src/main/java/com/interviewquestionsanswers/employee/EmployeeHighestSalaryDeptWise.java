package com.interviewquestionsanswers.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeHighestSalaryDeptWise {

	public static void main(String[] args) {		

		List<Employee2> listOfEmployees = ListOfEmployee21DataForJava8.getEmployeesData();
	
	// data based on Highest Salary dept wise Approach --> 1
		List<Employee2> highestDataDeptWise =	listOfEmployees.stream()
	.collect(Collectors.groupingBy(Employee2::getDepartment))
	.values().stream().map(deptEmp -> deptEmp.stream().max(Comparator.comparing(Employee2::getSalary)).orElse(null))
	.collect(Collectors.toList());
		
		//highestDataDeptWise.forEach(System.out::println);
		
		Map<String, Employee2> mapHighest = listOfEmployees.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(),
						Collectors.collectingAndThen(Collectors.maxBy(
								Comparator.comparingDouble(e -> e.getSalary())),
								Optional::get)));
		System.out.println(mapHighest);
		
	}

}
