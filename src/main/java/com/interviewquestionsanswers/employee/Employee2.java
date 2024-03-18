package com.interviewquestionsanswers.employee;

import java.util.Objects;

public class Employee2 {
	 	private int id;
	    private String name;
	    private int age;
	    private String gender;
	    private String department;
	    private int joiningYear;
	    private double salary;
	    private String grade;
	    private String address;
	    private String mobileNumber;
		public Employee2(int id, String name, int age, String gender, String department, int joiningYear, double salary,
				String grade, String address, String mobileNumber) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.joiningYear = joiningYear;
			this.salary = salary;
			this.grade = grade;
			this.address = address;
			this.mobileNumber = mobileNumber;
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
		public int getJoiningYear() {
			return joiningYear;
		}
		public void setJoiningYear(int joiningYear) {
			this.joiningYear = joiningYear;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		@Override
		public int hashCode() {
			return Objects.hash(address, age, department, gender, grade, id, joiningYear, mobileNumber, name, salary);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee2 other = (Employee2) obj;
			return Objects.equals(address, other.address) && age == other.age
					&& Objects.equals(department, other.department) && Objects.equals(gender, other.gender)
					&& Objects.equals(grade, other.grade) && id == other.id && joiningYear == other.joiningYear
					&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
		@Override
		public String toString() {
			return "Employee2 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
					+ department + ", joiningYear=" + joiningYear + ", salary=" + salary + ", grade=" + grade
					+ ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
		}
	    
	    
	    
}
