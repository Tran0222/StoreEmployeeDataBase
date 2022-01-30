
/* Student Name: Jennifer Tran
 * Lab Professor: Howard Rosenblum
 * Due Date: January 29,2022
 * Description: This class will store 2 methods to read the input details of an employee and print the details
*/
import java.util.Scanner;

// This class stores 2 methods: readEmployee and printEmployee
// readEmployee: prompts the users input/ reads inputs
// printEmployee: calculates salary and prints details using print format
public class Employee {

	// instance variables
	private int employeeNumber;
	private Person emp;
	private double numHours;
	private double hourlyPay;

	// no arg constructor
	Employee() {
	}

	// arg constructor
	Employee(int empNum, String fName, String lName, String email, long pNumber, double nHours, double hPay) {
		employeeNumber = empNum;
		emp = new Person(fName, lName, email, pNumber); // invoke Person constructor
		numHours = nHours;
		hourlyPay = hPay;
	}

	// This method prompts inputs & reads users inputs of employees info
	public void readEmployee(Scanner input) {
		System.out.print("Enter Employee Number: ");
		employeeNumber = input.nextInt();
		input.nextLine();

		System.out.print("Enter first name: ");
		String fName = input.nextLine();

		System.out.print("Enter last name: ");
		String lName = input.nextLine();

		System.out.print("Enter email: ");
		String email = input.next();

		System.out.print("Enter phone: ");
		long pNumber = input.nextLong();

		System.out.print("Enter number of hours worked: ");
		numHours = input.nextDouble();

		System.out.print("Enter hourly pay: ");
		hourlyPay = input.nextDouble();

		emp = new Person(fName, lName, email, pNumber); // invoke Person constructor

	}

	// This method calculates the employees salary & prints details of an employee
	// using print format
	public void printEmployee() {
		double salary = numHours * hourlyPay;

		System.out.printf("%12d |%23s |%23s |%15d |%12.2f |\n", employeeNumber, emp.getName(), emp.getEmail(),
				emp.getPhoneNumber(), salary);

	}
}// end class
