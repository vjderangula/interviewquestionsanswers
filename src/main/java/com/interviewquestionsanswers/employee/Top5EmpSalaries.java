package com.interviewquestionsanswers.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Top5EmpSalaries {

	public static void main(String[] args) {

		
		List<Employee> listOfEmployees = ListOfEmployeeDataForJava8.getEmployeesData();

		Map<String, List<Employee>> top5EmpByDepartment = listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		
		top5EmpByDepartment.forEach((department, employeeList) -> {
			
			System.out.println("Top 5 Salaries in Department "+ department + " :");
			employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			.limit(5)
			.forEach(employee -> System.out.println(employee.getName() + ": " + employee.getSalary()));
            System.out.println();
		});
		
		/*
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Generate a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", "HR", 60000));
        employees.add(new Employee(102, "Alice", "HR", 55000));
        employees.add(new Employee(103, "Bob", "IT", 70000));
        employees.add(new Employee(104, "Mary", "IT", 65000));
        // Add more employees...

        // Find top 5 salaries for each department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println("Top 5 salaries in department " + department + ":");
            employeeList.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .limit(5)
                    .forEach(employee -> System.out.println(employee.getName() + ": " + employee.getSalary()));
            System.out.println();
        });
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

		
		*/
	}

}
