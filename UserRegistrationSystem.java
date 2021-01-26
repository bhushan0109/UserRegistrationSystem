import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UC2
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

		String regex = "^[A-Z][a-z]{2,}$"; // first name validation check condition
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

	public static void main(String[] args) throws IOException {

		UserRegistrationSystem  ob = new UserRegistrationSystem ();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.First Name Validation");
		System.out.println("2.Last Name Validation");
		System.out.print("Enter choice");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ob.fNameCheck();
			break;
		case 2:
			ob.lNameCheck();
			break;
		}
	}
}
