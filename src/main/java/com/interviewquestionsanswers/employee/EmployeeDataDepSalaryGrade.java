package com.interviewquestionsanswers.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDataDepSalaryGrade {

	public static void main(String[] args) {

		
		
		List<Employee2> listOfEmployees = ListOfEmployee21DataForJava8.getEmployeesData();
	
	// group employees based on dept wise
Map<String, List<Employee2>> mapDataDeptWise =	listOfEmployees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));
	

//System.out.println(mapDataDeptWise);
// find data based on salary > 25000 && Grade A
Map<String, List<Employee2>> mapSalGrade =	mapDataDeptWise.entrySet().stream()
						.filter(entry -> entry.getValue().stream()
						.anyMatch(employee -> employee.getSalary() > 25000 && employee.getGrade().equals("A")))
						.collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue));		

mapSalGrade.forEach((department, employees) -> {
	System.out.println("Department : "+department);
	employees.forEach(System.out:: println);
});
	}

}
