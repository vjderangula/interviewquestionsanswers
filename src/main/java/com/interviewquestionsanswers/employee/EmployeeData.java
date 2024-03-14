package com.interviewquestionsanswers.employee;

/*
To sort a list of employees based on their names and print only the names starting with the letter 'A' using the Stream API in Java, you can filter the employees whose names start with 'A' after sorting. Here's how you can implement it:

```java
*/import java.util.Comparator;
import java.util.List;

public class EmployeeData {
    private int id;
    private String name;


    public EmployeeData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	public static void main(String[] args) {
        // Example list of employees
        List<EmployeeData> employees = List.of(
                new EmployeeData(1, "John"),
                new EmployeeData(2, "Alice"),
                new EmployeeData(3, "Bob"),
                new EmployeeData(4, "Anna"),
                new EmployeeData(5, "Amy")
        );

        // Sort employees by name in ascending order using Stream API
        // Filter and print only names starting with letter 'A'
        employees.stream()
                .sorted(Comparator.comparing(EmployeeData::getName))
                .filter(employee -> employee.getName().startsWith("A"))
                .forEach(employee -> System.out.println(employee.getName()));
    }

    // Other methods
}
/*
 * ```
 * 
 * Output: ``` Alice Amy Anna ```
 * 
 * In this example: - We have a class `Employee` with attributes `id` and
 * `name`, along with constructor, getters, and setters. - We create an example
 * list of employees. - We use the Stream API to sort the list of employees
 * based on their names in ascending order using the `sorted()` method with a
 * comparator created by `Comparator.comparing()` method, which takes a method
 * reference to `Employee::getName` to get the name of each employee. - We then
 * filter the employees whose names start with the letter 'A' using the
 * `filter()` method with a predicate that checks if the name starts with "A". -
 * Finally, we print the names of the filtered employees.
 */