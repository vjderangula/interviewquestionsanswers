package com.interviewquestionsanswers.employee;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployeeDataForJava8 {
		
	public static List<Employee> getEmployeesData (){
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		

listOfEmployees.add(new Employee (101, "Brein", 32, "Female", "Human Resources", 2011, 205000.0));
 listOfEmployees.add(new Employee (102, "Paul", 25, "Male", "Sales And Marketing", 2015, 1035000.0));
 listOfEmployees.add(new Employee (103, "Martin", 29, "Male", "Infrastructure", 2012, 1035000.0));
 listOfEmployees.add(new Employee (104, "Govardhan", 28, "Male", "Product Development", 2014, 325000.0));
 listOfEmployees.add(new Employee (105, "Roy", 27, "Female", "Human Resources", 2013, 22700.0));
 listOfEmployees.add(new Employee (106, "Iqbal", 43, "Male", "Transport And Security", 2016, 100500.0));
 listOfEmployees.add(new Employee (107, "Sharma", 35, "Male", "Account And Finance", 2010, 270000.0));
 listOfEmployees.add(new Employee (108, "Iaon", 31, "Male", "Product Development", 2015, 384500.0));
 listOfEmployees.add(new Employee (109, "Amelia", 24, "Female", "Sales And Marketing", 2016, 101500.0));
 listOfEmployees.add(new Employee (110, "Jaden", 38, "Male", "Security And Transport", 2015, 101000.5));
 listOfEmployees.add(new Employee (111, "Jasna", 27, "Female", "Infrastructure", 2014, 105700.0));
 listOfEmployees.add(new Employee (112, "Joshi", 25, "Male", "Product Development", 2016, 208200.0));
 listOfEmployees.add(new Employee (113, "Jyothi", 27, "Female", "Account And Finance", 2013, 201300.0));
 listOfEmployees.add(new Employee (114, "Nicolus", 24, "Male", "Sales And Marketing", 2017, 100700.5));
 listOfEmployees.add(new Employee (115, "Ali", 23, "Male", "Infrastructure", 2018, 102700.0));
 listOfEmployees.add(new Employee (116, "Pandey", 26, "Female", "Product Development", 2015, 288900.0));
 listOfEmployees.add(new Employee (117, "Anuj", 31, "Male", "Product Development", 2012, 305700.0));
		
		return listOfEmployees;
	}
	

}
