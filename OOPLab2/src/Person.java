/* Student Name: Jennifer Tran
 * Lab Professor: Howard Rosenblum
 * Due Date: January 29,2022
 * Description: This class will store the persons: first/ last name, email & phone number
*/
// This class will store the persons: first/ last name, email & phone number with getter methods
public class Person {

	// instance variables
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;

	// no arg constructor
	Person() {

	}

	// arg constructor
	Person(String fName, String lName, String email, long pNumber) {
		firstName = fName;
		lastName = lName;
		this.email = email;
		phoneNumber = pNumber;
	}

	// get method Name : first & last
	public String getName() {
		return firstName + " " + lastName;
	}

	// get method Email
	public String getEmail() {
		return email;
	}

	// get method PhoneNumber
	public long getPhoneNumber() {
		return phoneNumber;
	}

}// end class
