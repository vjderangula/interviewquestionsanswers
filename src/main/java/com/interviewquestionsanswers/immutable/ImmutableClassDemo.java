package com.interviewquestionsanswers.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ImmutableClassDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		 
		ImmutableAddress iAddress1 = new ImmutableAddress("s1", "c1");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123345");
        phoneNumbers.add("456789");
        Map<String, String> metadata = new HashMap<>();
        metadata.put("hobby", "Watching Movies");
        ImmutableEmployee e = new ImmutableEmployee("John", 23, iAddress1, phoneNumbers, metadata);

        // modifications
        e.getAddress().setCity("c3");
        e.getAddress().setStreet("s3");
        e.getPhoneNumbers().add("1234");
        e.getMetadata().put("skill", "Java");
        e.getMetadata().put("designation", "HR");

        System.out.println(e.getEmpName());
        System.out.println(e.getAge());
        System.out.println(e.getAddress());
        System.out.println(e.getPhoneNumbers());
        System.out.println(e.getMetadata());
	}

}
final class ImmutableEmployee {
    private final String empName;
    private final int age;
    private final ImmutableAddress iAddress;
    private final List<String> phoneNumbers;
    private final Map<String, String> metadata;

    public ImmutableEmployee(String name, int age, ImmutableAddress address, List<String> phoneNumbers, Map<String, String> metadata) {
        super();
        this.empName = name;
        this.age = age;
        this.iAddress = address;
        this.phoneNumbers = phoneNumbers;
        this.metadata = metadata;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    // clone the address object
    public ImmutableAddress getAddress() throws CloneNotSupportedException {
        return (ImmutableAddress) iAddress.clone();
    }

    // deep copy the list of phone numbers
    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    // deep copy the map of metadata
    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }
}

final class ImmutableAddress implements Cloneable {

    private String street;
    private String city;

    public ImmutableAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{Street: " + street + ", City: " + city + "}";
    }

}

