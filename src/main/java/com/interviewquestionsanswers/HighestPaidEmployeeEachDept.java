package com.interviewquestionsanswers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestPaidEmployeeEachDept {

	public static void main(String[] args) {

	List<Employee> listOfEmployees = ListOfEmployeeDataForJava8.getEmployeesData();

	List<Employee> empHighestSalaryEachDept = listOfEmployees.stream()
	   .collect(Collectors.groupingBy(Employee::getDepartment)).values().stream()
       .map(deptEmp -> deptEmp.stream().max(Comparator.comparing(Employee::getSalary))
       .orElse(null)).collect(Collectors.toList());

	empHighestSalaryEachDept.forEach(System.out::println);

	}

}
