package com.interviewquestionsanswers.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDataBasedOnGender {

	public static void main(String[] args) {

		
		
		List<Employee2> listOfEmployees = ListOfEmployee21DataForJava8.getEmployeesData();
	
	// group employees based on gender wise
Map<String, List<Employee2>> mapDataGenderWise =	listOfEmployees.stream().collect(Collectors.groupingBy(Employee2::getGender));

mapDataGenderWise.forEach((k,v) -> System.out.println(k+" : \n"+v +"\n"));

	}

}
