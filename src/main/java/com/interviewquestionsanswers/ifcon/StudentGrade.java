package com.interviewquestionsanswers.ifcon;

public class StudentGrade {
	
	    private int marks;

	    public StudentGrade(int marks) {
	       this.marks = marks; // TODO: Assign 'marks' to the instance variable 'this.marks'
	    }

	    public char assignGrade() {
	        // TODO: Implement the method which assigns the grade based on marks.
	      
	        // If marks are less than 0 or greater than 100, return 'X'
	        if(marks < 0 || marks>100){
	            
	           return 'X';
	        } 
	        
	        // If marks are greater than or equal to 90, return 'A'
	       else if (marks>= 90 && marks <=100){
	           
	           return 'A';
	        }
	        // If marks are greater than or equal to 80, return 'B'
	        
	       else if (marks>= 80 && marks <=89){
	            
	           return 'B';
	        }
	        // If marks are greater than or equal to 70, return 'C'
	       else if (marks>= 70 && marks <=79){
	          
	          return 'C';
	        }
	        // If marks are greater than or equal to 60, return 'D'
	        else if (marks>= 60 && marks <=69){
	          
	          return 'D';
	        }
	        // If marks are greater than or equal to 50, return 'E'
	        else if (marks>= 50 && marks <=59){
	            return 'E';
	          
	        }
	        // If marks are less than 50, return 'F'
	        else{
	            return'F';
	           
	        }
	      
	    }
	
}
/*
 * 
 * Coding Exercise: Student Grades A to F based on Marks
You are tasked with implementing the functionality of a Student class which calculates and assigns the student's grade based on the provided marks.

A student's grade is determined by the following criteria:

If the student's marks are less than 0 or greater than 100, the grade should be 'X'.

If the student's marks are greater than or equal to 90, the grade should be 'A'.

If the student's marks are greater than or equal to 80 but less than 90, the grade should be 'B'.

If the student's marks are greater than or  equal to 70 but less than 80, the grade should be 'C'.

If the student's marks are greater than or equal to 60 but less than 70, the grade should be 'D'.

If the student's marks are greater than or equal to 50 but less than 60, the grade should be 'E'.

If the student's marks are less than 50, the grade should be 'F'.

Class Structure

The class Student contains the following:

An instance variable marks of type int.

A constructor that accepts an int parameter to initialize marks.

A method assignGrade() that returns a char, representing the student's grade based on the provided marks.

Here's the skeleton of the class you will work with:

public class Student {
    private int marks;
 
    public Student(int marks) {
        // TODO: Assign 'marks' to the instance variable 'this.marks'
    }
 
    public char assignGrade() {
        // TODO: Implement the method which assigns the grade based on marks.
        // If marks are less than 0 or greater than 100, return 'X'
        // If marks are greater than or equal to 90, return 'A'
        // If marks are greater than or equal to 80, return 'B'
        // If marks are greater than or equal to 70, return 'C'
        // If marks are greater than or equal to 60, return 'D'
        // If marks are greater than or equal to 50, return 'E'
        // If marks are less than 50, return 'F'
    }
}
Task

Your task is to implement the Student(int marks) constructor and assignGrade() method in the Student class.

Student(int marks) - This constructor will take one parameter, marks (an integer), and it should assign it to the marks instance variable.

assignGrade() - This method should return a character representing the grade of the student, based on the marks they have received.

If marks are:

less than 0 or greater than 100, return 'X'

greater than or equal to 90, return 'A'

greater than or equal to 80, return 'B'

greater than or equal to 70, return 'C'

greater than or equal to 60, return 'D'

greater than or equal to 50, return 'E'

less than 50, return 'F'

Examples

Here are some examples of how your Student class should behave once implemented:

Student student = new Student(85);
System.out.println(student.assignGrade()); // Should print 'B'
Student student = new Student(101);
System.out.println(student.assignGrade()); // Should print 'X'
In the first example, the student's marks are 85, so the grade is 'B'. In the second example, the student's marks exceed the maximum possible mark of 100, so the method returns 'X' to indicate an invalid mark.

Good luck! Your effective implementation can pass all the examples and additional tests.
 ==========================
 
 Hint 1: Start by initializing the marks variable with the value passed in the constructor.

Hint 2: In the assignGrade method, use conditional (if-else) statements to assign the grade based on the value of marks.

Hint 3: Remember to include a condition to check for invalid marks (less than 0 or more than 100) and in such a case, return 'X' to indicate an invalid input.

Hint 4: Keep in mind that the grade assignment is based on a range of marks. So make sure to correctly write your conditions to cover all ranges (90-100, 80-89, 70-79, 60-69, 50-59, and less than 50).

Hint 5: The order of your conditions is important. For instance, if you start checking from the lower range (if marks >= 50), a student with 95 marks will also pass this condition and get a wrong grade. So, start checking from the highest range.

Good luck!
=========================


In the solution, we are implementing a Student class with a single instance variable marks and two methods.

Here's the solution code:

public class Student {
 
    // Instance variable for storing student's marks.
    private int marks;
 
    // Constructor for the Student class.
    // It accepts an integer which represents the student's marks,
    // and assigns it to the instance variable 'marks'.
    public Student(int marks) {
        this.marks = marks;
    }
 
    // Method to assign a grade based on the student's marks.
    // It uses conditional statements to determine the grade.
    public char assignGrade() {
        // Check if the marks are out of the expected range (0 to 100).
        // If so, return 'X' to indicate invalid input.
        if (marks < 0 || marks > 100) {
            return 'X';
        }
        // If marks are 90 or above, assign grade 'A'.
        else if (marks >= 90) {
            return 'A';
        }
        // If marks are 80 or above (but less than 90), assign grade 'B'.
        else if (marks >= 80) {
            return 'B';
        }
        // If marks are 70 or above (but less than 80), assign grade 'C'.
        else if (marks >= 70) {
            return 'C';
        }
        // If marks are 60 or above (but less than 70), assign grade 'D'.
        else if (marks >= 60) {
            return 'D';
        }
        // If marks are 50 or above (but less than 60), assign grade 'E'.
        else if (marks >= 50) {
            return 'E';
        }
        // If marks are less than 50, assign grade 'F'.
        else {
            return 'F';
        }
    }
}
Code Explanation

The Student constructor accepts an integer value as parameter which represents the marks for a student. This value is assigned to the instance variable marks.

public Student(int marks) {
    this.marks = marks;
}
The assignGrade method is used to assign a grade to a student based on the marks. This is done using conditional (if-else) statements.

public char assignGrade() {
    if (marks < 0 || marks > 100) {
        return 'X'; // Indicating invalid input
    } else if (marks >= 90) {
        return 'A';
    } else if (marks >= 80) {
        return 'B';
    } else if (marks >= 70) {
        return 'C';
    } else if (marks >= 60) {
        return 'D';
    } else if (marks >= 50) {
        return 'E';
    } else {
        return 'F';
    }
}
We first check if the marks are less than 0 or greater than 100. If so, we return 'X' to indicate invalid marks. Otherwise, we assign grades 'A' to 'F' based on the range in which the marks fall.

That's it! With this implementation, the Student class can now assign a grade to a student based on their marks.
 * 
 * 
 * 
 * 
 */
