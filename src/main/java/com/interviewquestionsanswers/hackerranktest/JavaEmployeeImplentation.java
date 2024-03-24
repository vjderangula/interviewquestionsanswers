package com.interviewquestionsanswers.hackerranktest;

public class JavaEmployeeImplentation {
	
	public static void main(String[] args) {
		
		Company companyEngFirm = new EngineeringFirm(5);
		Company companyAccFirm = new AccountantFirm(5);
		
		int[] salariesEngFirm = {6848, 9329, 9984, 5543, 7986};
		companyEngFirm.assignSalaries(salariesEngFirm);
		companyEngFirm.averageSalary();
		companyEngFirm.maxSalary();
		companyEngFirm.minSalary();
		System.out.println("      ==================               ");
		int[] salariesAccFirm = {9317, 7796, 3352, 7068, 9500};
		companyAccFirm.assignSalaries(salariesAccFirm);
		companyAccFirm.averageSalary();
		companyAccFirm.maxSalary();
		companyAccFirm.minSalary();
		
		
	}

}

interface Company {
    void assignSalaries(int[] salaries);
    void averageSalary();
    void maxSalary();
    void minSalary();
}

class EngineeringFirm implements Company {
    private int[] income;

    public EngineeringFirm(int n) {
        this.income = new int[n];
        for (int i = 0; i < n; i++) {
            income[i] = 0;
        }
    }

    @Override
    public void assignSalaries(int[] salaries) {
        System.out.println("Income of Engineers Credited");
        for (int i = 0; i < Math.min(salaries.length, income.length); i++) {
            income[i] = salaries[i];
        }
    }

    @Override
    public void averageSalary() {
        int sum = 0;
        int count = 0;
        for (int i : income) {
            sum += i;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average salary of Engineers is %.2f\n", average);
        } else {
            System.out.println("No engineers assigned salaries.");
        }
    }

    @Override
    public void maxSalary() {
        if (income.length == 0) {
            System.out.println("No engineers assigned salaries.");
            return;
        }
        int max = income[0];
        for (int i = 1; i < income.length; i++) {
            if (income[i] > max) {
                max = income[i];
            }
        }
        System.out.println("Maximum salary amongst engineers is " + max);
    }

    @Override
    public void minSalary() {
        if (income.length == 0) {
            System.out.println("No engineers assigned salaries.");
            return;
        }
        int min = income[0];
        for (int i = 1; i < income.length; i++) {
            if (income[i] < min) {
                min = income[i];
            }
        }
        System.out.println("Minimum salary amongst engineers is " + min);
    }
}

class AccountantFirm implements Company {
    private int[] income;

    public AccountantFirm(int n) {
        this.income = new int[n];
        for (int i = 0; i < n; i++) {
            income[i] = 0;
        }
    }

    @Override
    public void assignSalaries(int[] salaries) {
        System.out.println("Income of Accountant Credited");
        for (int i = 0; i < Math.min(salaries.length, income.length); i++) {
            income[i] = salaries[i];
        }
    }

    @Override
    public void averageSalary() {
        int sum = 0;
        int count = 0;
        for (int i : income) {
            sum += i;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average salary of Accountant is %.2f\n", average);
        } else {
            System.out.println("No accountants assigned salaries.");
        }
    }

    @Override
    public void maxSalary() {
        if (income.length == 0) {
            System.out.println("No accountants assigned salaries.");
            return;
        }
        int max = income[0];
        for (int i = 1; i < income.length; i++) {
            if (income[i] > max) {
                max = income[i];
            }
        }
        System.out.println("Maximum salary amongst accountants is " + max);
    }

    @Override
    public void minSalary() {
        if (income.length == 0) {
            System.out.println("No accountants assigned salaries.");
            return;
        }
        int min = income[0];
        for (int i = 1; i < income.length; i++) {
            if (income[i] < min) {
                min = income[i];
            }
        }
        System.out.println("Minimum salary amongst accountants is " + min);
    }
}


/*
 * 
Java Employee Implementation

An Interface named Company create the following methods
void assignSalaries(int[] salaries);
void average Salary();
void maxSalary();
void minSalary();

create two classes, EngineeringFirm and AccountFirm, that implement the Company interface. the default of these classes as follow.

1. class EngineerFirm should have a variable of type int[] income. It should implement the following methods.
EngineerFirm(int n)
 initializes the empty array income of length n where n is the number of engineers.
 Assigns 0 income to all the engineers
void assignSalaries(int[] salaries): Assigns the salaries in array salaries to income.
 If the salaries and income arrays differ in length, assign as many values as possible and then stops.
 Prints "Income of Engineers Credited".
void averageSalary(): Prints the average salary in the format "Average salary of Engineers is "{averageSalary}".
 zero values in income if any should be included in the average calculation.
void maxSalary(): Print the maximum salary in the format "Maximun salary amongst engineers is {maximumSalary}".
void minSalary(): Prints the minimum salary in the format "Minimum salary amongst engineers is {minimumSalary}".

2. class AccountantFirm should have a variable of type int[] income. It should implement the following methods.

AccountantFirm(int n):
	initializes the empty array income of length n where n is the number of accouttants.
	Assigns 0 income to each account.
void assignSalaries(int[] salaries): Assigns the salaries in array salaries to income.
 If the salaries and income arrays differ in length, assign as many values as possible and then stops.
 Prints "Income of Accountant Credited".
void averageSalary(): Prints the average salary in the format "Average salary of Accountant is "{averageSalary}".
 zero values in income if any should be included in the average calculation.
void maxSalary(): Print the maximum salary in the format "Maximun salary amongst Accountant is {maximumSalary}".
void minSalary(): Prints the minimum salary in the format "Minimum salary amongst Accountant is {minimumSalary}".


Note: Please use inheritance and encapsulation to minimize code repetition . the locked code stub provides the interface Company and also vlidates the implemetation of the EngineerFirm and AccountantFirm classes.




 input 
 5 5
 6848, 9329, 9984, 5543, 7986
 9317, 7796, 3352, 7068, 9500
Income of Engineers Credited
Average salary of Engineers is 7938.00
Maximum salary amongst engineers is 9984
Minimum salary amongst engineers is 5543
      ==================               
Income of Accountant Credited
Average salary of Accountant is 7406.60
Maximum salary amongst accountants is 9500
Minimum salary amongst accountants is 3352 
  
 
 * 
 * 
 */
 

