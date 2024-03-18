package com.interviewquestionsanswers.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeeNameAndSalary {

	public static void main(String[] args) {
List<Employee> empList = ListOfEmployeeDataForJava8.getEmployeesData();

//List<Employee> empListSalary = empList.stream().filter(e->e.getSalary()>10000).collect(Collectors.toList());

//empListSalary.forEach(System.out::println);


List<Double> salary = empList.stream().filter(e->e.getSalary()<10000).map(e->e.getSalary())
.collect(Collectors.toList());

System.out.println(salary);



	}

}
