
/* Student Name: Jennifer Tran
 * Lab Professor: Howard Rosenblum
 * Due Date: January 29,2022
 * Description: This class invokes Employees class: will read/ print the employees details & prints title 
*/
import java.util.Scanner;

// This class will store 4 methods: readEmployeesDetails, printEmployeesDetails, printLine & printTitle
public class Store {

	// instance variable
	private Employee[] employees; // employee array

	// no arg constructor
	Store() {

	}

	// arg constructor
	Store(int num) {

		employees = new Employee[num]; // employees array

	}

	// This method reads the details of all employees by using a for loop
	public void readEmployeeDetails(Scanner input) {
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter details of employee " + (i + 1)); // starts at 1
			employees[i] = new Employee(); // invokes Employee class
			employees[i].readEmployee(input);

		}

	}

	// This method will call Employees class to print details of all employees
	public void printEmployeeDetails() {
		for (int i = 0; i < employees.length; i++) {
			employees[i].printEmployee();

		}

	}

	// This method prints the output of the boarder using a for loop
	public static void printLine() {
		for (int i = 0; i < 95; i++)
			System.out.print("=");
		System.out.println();
	}

	// This method prints the title of the output & calls method printLine for the
	// output of the boarder
	// will use print format to store the employees details
	public static void printTitle(String sName) {

		printLine();
		System.out.printf("%35s %23s \n", sName, "Store Management System"); // prints title from the users input (store name)
		printLine();
		System.out.printf("%12s |%23s |%23s |%15s |%12s |\n", "Emp#", "Name", "Email", " Phone", "Salary");

		printLine();

	}
}// end class
