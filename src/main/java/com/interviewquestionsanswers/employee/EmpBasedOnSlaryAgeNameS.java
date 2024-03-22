package com.interviewquestionsanswers.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmpBasedOnSlaryAgeNameS {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String gender;
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
        return name;
    }

    public EmpBasedOnSlaryAgeNameS(int id, String name, int age, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public void increaseSalary(double percentage) {
        salary *= (1 + percentage / 100);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Gender: " + gender;
    }

    public boolean isEligibleForSalaryIncrease() {
        return salary < 50000 && age > 25 && name.startsWith("S");
    }


    public static void main(String[] args) {
        // Creating list of employees
        List<EmpBasedOnSlaryAgeNameS> employees = Arrays.asList(
            new EmpBasedOnSlaryAgeNameS(1, "John", 30, 45000, "Male"),
            new EmpBasedOnSlaryAgeNameS(2, "Samantha", 28, 49000, "Female"),
            new EmpBasedOnSlaryAgeNameS(3, "Steve", 35, 52000, "Male"),
            new EmpBasedOnSlaryAgeNameS(4, "Sarah", 27, 48000, "Female"),           
            new EmpBasedOnSlaryAgeNameS(5, "Maria", 27, 48000, "Female"),
            new EmpBasedOnSlaryAgeNameS(6, "Michael", 29, 47000, "Male")
        );

        // Increase salary by 10% for eligible employees using Stream API
        List<EmpBasedOnSlaryAgeNameS> eligibleEmployees = employees.stream()
                .filter(EmpBasedOnSlaryAgeNameS::isEligibleForSalaryIncrease)
                .peek(e -> e.increaseSalary(10))
                .collect(Collectors.toList());

        // Print the updated details of eligible employees
        System.out.println("Updated details of eligible employees after salary increase:");
        eligibleEmployees.forEach(System.out::println);
        
        
        // Print names of employees whose ID is even
        System.out.println("Names of employees whose ID is even:");
        employees.stream()
                 .filter(e -> e.getId() % 2 == 0)
                 .map(EmpBasedOnSlaryAgeNameS::getName)
                 .forEach(System.out::println);
        
        // Filter and print female employees along with their salaries
        System.out.println("============");
        System.out.println("Female employees and their salaries:");
        employees.stream()
            .filter(e -> e.getGender().equals("Female"))
            .forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));

        // Print the number of female employees along with their salaries
        long femaleCount = employees.stream()
                .filter(e -> e.getGender().equals("Female"))
                .peek(e -> System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary()))
                .count();

        System.out.println("Total number of female employees: " + femaleCount);
    }
}

