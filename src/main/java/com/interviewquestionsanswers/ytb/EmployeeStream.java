package com.interviewquestionsanswers.ytb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStream {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public EmployeeStream(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {		
		
		List<EmployeeStream> employeeList = new ArrayList<EmployeeStream>();
		
		 employeeList.add(new EmployeeStream(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		 employeeList.add(new EmployeeStream (122, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		 employeeList.add(new EmployeeStream (133, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0)); 
		 employeeList.add(new EmployeeStream (144, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		 employeeList.add(new EmployeeStream (155,	"Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		 employeeList.add(new EmployeeStream (166,"Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0)); 
		 employeeList.add(new EmployeeStream (177, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5)); 
		 employeeList.add(new EmployeeStream (188,"Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		 employeeList.add(new EmployeeStream (199,	"Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		 employeeList.add(new EmployeeStream (244, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		 employeeList.add(new EmployeeStream (255, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		 employeeList.add(new EmployeeStream (266,"Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0)); 
		 employeeList.add(new EmployeeStream (200,	 "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0)); 
		 employeeList.add(new EmployeeStream (211, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		 employeeList.add(new EmployeeStream (222, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		 employeeList.add(new EmployeeStream (233, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		 employeeList.add(new EmployeeStream (277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		 
		 // Q1. How many male and female employees are there in the organization?
		 Map<String, Long> gendercount = employeeList.stream().collect(Collectors.groupingBy(EmployeeStream::getGender, Collectors.counting()));
		 System.out.println(gendercount);
		 
		 //Q2. Print the name of all departments in the organization?
		 Set<String> deptSet = employeeList.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet());
		 System.out.println(deptSet);
	}

}
