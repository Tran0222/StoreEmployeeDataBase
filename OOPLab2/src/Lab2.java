
/* Student Name: Jennifer Tran
 * Lab Professor: Howard Rosenblum
 * Due Date: January 29,2022
 * Description: This is the main class will prompt users inputs and store the employees details into the system
*/
import java.util.Scanner;

// This class will prompt the users inputs and calls 3 methods from the store class
public class Lab2 {

	public static void main(String[] args) { // start of main
		Scanner input = new Scanner(System.in); // Scanner class: input

		// prompts inputs and reads users inputs
		System.out.print("Enter name of the store: ");
		String sName = input.nextLine();
		System.out.print("How many employees do you have? ");
		int num = input.nextInt(); // num will be used in parameters of store object

		Store store = new Store(num); // new object store class: parameter num from user input

		store.readEmployeeDetails(input); // calls store class object to read employees details

		Store.printTitle(sName); // calls Store class (static method) to print title

		store.printEmployeeDetails(); // calls store class object to print employee details

		input.close(); // closes the Scanner input

	}// end of main

}// end of class
