import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem  {
	static Scanner sc = new Scanner(System.in); // declare static

	void fNameCheck() { // first name check

		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		String regex = "^[A-Z][a-z]{2,}$"; // first name validation check
		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("Given first name is valid");
		} else {
			System.out.println("not valid");
			System.out.println("First name starts with Cap and minimum 3 characters ex:Bhu");
		}
	}

	void lNameCheck() { // last name check

		System.out.println("Enter your last name: ");
		String name = sc.nextLine();

		String regex = "^[A-Z][a-z]{2,}$"; //  last name validation check
		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("Given last name is valid");
		} else {
			System.out.println("not valid");
			System.out.println("last name starts with Cap and minimum 3 characters ex:Pat");

		}
	}

	void validEmailCheck() {
		System.out.println("Enter your email id: ");
		String name = sc.nextLine();

		String regex = "[a-z]+[.]+[a-z]+[@]+[a-z]{1,2}+[.]+[a-z]{1,2}+[.]+[a-z]{1,2}$";

		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println(" Email is valid");
		} else {
			System.out.println("Not valid");
			System.out.println("Email id shhoul be this pattern ex:abc.xyz@bl.co.in ");
		}
	}

	void mobileFormatCheck() { // first name check

		System.out.println("Enter your mobile number: ");
		String name = sc.nextLine();

		String regex = "[91]+[\s]+[0-9]{10}"; 
		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("mobile number is  valid");
		} else {
			System.out.println("not valid");
			System.out.println("mobile number formate should be ex:91 9967546345 ");
		}
	}

	public static void main(String[] args) throws IOException {

		UserRegistrationSystem  ob = new UserRegistrationSystem ();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.First Name Validation");
		System.out.println("2.Last Name Validation");
		System.out.println("3.Email Validation ");
		System.out.println("4.Mobile Number Validation ");
		System.out.println("Enter choice");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ob.fNameCheck();
			break;
		case 2:
			ob.lNameCheck();				//METHOD CALLING
			break;
		case 3:
			ob.validEmailCheck();
			break;
		case 4:
			ob.mobileFormatCheck();
			break;
		}
	}
}
