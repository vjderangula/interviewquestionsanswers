package com.interviewquestionsanswers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAverageSalaryOfEachDept {

	public static void main(String[] args) {
		List<Employee> listOfEmployees = ListOfEmployeeDataForJava8.getEmployeesData();
		Map<String, Double> avgSalaryEachDept = listOfEmployees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.averagingDouble(Employee::getSalary)));

		for (Map.Entry<String, Double> entry : avgSalaryEachDept.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
