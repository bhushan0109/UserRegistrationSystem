import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//UC1
public class UserRegistrationSystem {

	static Scanner sc = new Scanner(System.in); // declare static

	void fNameCheck() {

		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		String regex = "^[A-Z][a-z]{2,}$"; // FIRST NAME VALID CHECK CONDITION
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

	public static void main(String[] args) throws IOException {

		UserRegistrationSystem ob = new UserRegistrationSystem();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.First Name Validation Checking");
		System.out.print("Enter choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ob.fNameCheck(); // METHOD CALLING
			break;

		}
	}
}
