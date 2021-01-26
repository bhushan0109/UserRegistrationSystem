import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem  {
	static Scanner sc = new Scanner(System.in);

	void fNameCheck() { // first name check

		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		String regex = "^[A-Z][a-z]{2,}$"; // last name valid check condition
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

		String regex = "^[A-Z][a-z]{2,}$"; // last name valid check condition
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

		String regex = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9 .\\-]+\\.[A-Za-z]{2,6}";;

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

		String regex = "[91]+[\s]+[0-9]{10}"; // mobile number check condition
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

	void passwordFormatCheck1() {
		System.out.println("Enter your password character: ");
		String name = sc.nextLine();

		String regex = "[a-z A-Z 0-9]{8,}"; // password condition = password should be 8 character
		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("password number is  valid");
		} else {
			System.out.println("not valid");
			System.out.println("paasword should be 8 character ");
		}
	}

	void passwordFormatCheck2() {
		System.out.println("Enter your password : ");
		String name = sc.nextLine();

		String regex = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}"; // password condition=paasword should be 8 character
		// Creating a pattern object //and upercase
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("password number is  valid");
		} else {
			System.out.println("not valid");
			System.out.println("paasword should be 8 character and one upercase");
		}
	}

	void passwordFormatCheck3() {
		System.out.println("Enter your password : ");
		String name = sc.nextLine();

		String regex = "(?=.*?[A-Z])(?=.*?[0-9])[a-z A-Z 0-9]{8,}"; // password condition= password should be 8
																	// character
		// Creating a pattern object //and upercase and numerical
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("password  is  valid");
		} else {
			System.out.println("not valid");
			System.out.println("paasword should be 8 character and one upercase and at list one numeric");
		}
	}
	void passwordFormatCheck4(){
		System.out.println("Enter your password : ");
		String name = sc.nextLine();

		String regex =  "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}"; 
		// password condition= password should be 8
		// character and one upper case and one numerical and one special symbol
		// Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		// Creating a Matcher object
		Matcher matcher = pattern.matcher(name);
		// Verifying whether given phone number is valid
		boolean result = matcher.matches();
		if (result == true) {
			System.out.println("password  is  valid");
		} else {
			System.out.println("not valid");
			System.out.println("paasword should be 8 character and one upercase and at list one numeric and special character");
		}
	}

	public static void main(String[] args) throws IOException {

		UserRegistrationSystem  ob = new UserRegistrationSystem ();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.First Name Validation");
		System.out.println("2.Last Name Validation");
		System.out.println("3.Email Validation ");
		System.out.println("4.Mobile Number Validation ");
		System.out.println("5.Password Number Validation 1 ");
		System.out.println("6.Password Number Validation 2 ");
		System.out.println("7.Password Number Validation 3 ");
		System.out.println("8.Password Number Validation 4 ");
		System.out.print("Enter choice:");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ob.fNameCheck();
			break;
		case 2:
			ob.lNameCheck(); // METHOD CALLING
			break;
		case 3:
			ob.validEmailCheck();
			break;
		case 4:
			ob.mobileFormatCheck();
			break;
		case 5:
			ob.passwordFormatCheck1();
			break;
		case 6:
			ob.passwordFormatCheck2();
			break;
		case 7:
			ob.passwordFormatCheck3();
			break;
		case 8:
			ob.passwordFormatCheck4();
			break;

		}
	}
}
