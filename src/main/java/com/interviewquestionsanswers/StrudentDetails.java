package com.interviewquestionsanswers;

import java.util.Date;
import java.util.Objects;

public class StrudentDetails {
	
	
	
	
	int StudentID;
	String FirstName;
	String LastName;
	Date DateOfBirth;
	String Gender;
	String Address;  
	String City; 
	String State;
	String Country;
	double GPA;
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, City, Country, DateOfBirth, FirstName, GPA, Gender, LastName, State, StudentID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StrudentDetails other = (StrudentDetails) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(City, other.City)
				&& Objects.equals(Country, other.Country) && Objects.equals(DateOfBirth, other.DateOfBirth)
				&& Objects.equals(FirstName, other.FirstName)
				&& Double.doubleToLongBits(GPA) == Double.doubleToLongBits(other.GPA)
				&& Objects.equals(Gender, other.Gender) && Objects.equals(LastName, other.LastName)
				&& Objects.equals(State, other.State) && StudentID == other.StudentID;
	}
	public StrudentDetails(int studentID, String firstName, String lastName, Date dateOfBirth, String gender,
			String address, String city, String state, String country, double gPA) {
		super();
		StudentID = studentID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Gender = gender;
		Address = address;
		City = city;
		State = state;
		Country = country;
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "StrudentDetails [StudentID=" + StudentID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", Country=" + Country + ", GPA=" + GPA + "]";
	}
	
	
	

}
