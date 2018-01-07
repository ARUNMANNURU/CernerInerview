import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 *
 *##Interview Questions

Exercise 1:

Develop an Allergy class which can hold different severities (HIGH, MEDIUM, LOW) and be tied to a Patient to retrieve the allergies associated with that patient and their respective severities.
Exercise 2:

Design a system for entering and displaying the allergies patients have with given fields.
Exercise 3:

Given a list of streamed patients (consisting of names, briths, date last seen), return the 3 most recently seen patients from that list. Assume the list of incoming patients is not ordered in any particular order.
Exercise 4:

Person Demographic Problem to store information about every person.
Exercise 5:

To record a new born's birth date and time reflecting the time zone.
Exercise 6:

Implementing a system that notifies nurse when a patient should receive medications.
Exercise 7:

Design a class where a nurse had to assign medication to a patient along with the start and the end dates (there may or may not be end date).
Exercise 8:

Temperature class to know whether patient has fever or not and in what location is the reading taken such as mouth, armpit, ear.
Default temperatures: 0.0º or 32.0F.
Convert Celsius to Fahrenheit.
Convert Fahrenheit to Celsius.
Update default temperature.
 *
 *
 */
public class Cener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Exercise 1:
//
//			Develop an Allergy class which can hold different severities (HIGH, MEDIUM, LOW) and be tied to a Patient to retrieve the allergies associated with that patient and their respective severities.

//		Exercise 2:
//
//			Design a system for entering and displaying the allergies patients have with given fields.

//		public Patient(String name, int age, Address address, List<Allergy> allergies, List<Disease> diseases)
//		public Address(String country, String state, String address, int number)
				
		Patient patient;
		Severity serverity;
		System.out.println("Enter the patient name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Enter age of patient");
		int age = scanner.nextInt();
		System.out.println("Enter country name");
		String country = scanner.nextLine();
		System.out.println("Enter state name");
		String state = scanner.nextLine();
		System.out.println("Enter address name");
		String address = scanner.nextLine();
		System.out.println("Enter phone number");
		String number = scanner.nextLine();
		System.out.println("Enter Allergy Name");
		String allergyName = scanner.nextLine();
		
	}
}
