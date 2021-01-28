package com.user.registration;

import java.util.regex.Pattern;

public class UserValidater {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9 .\\-]+\\.[A-Za-z]{2,6}";
	private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
	private static final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD2_PATTERN = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD3_PATTERN = "(?=.*?[A-Z])(?=.*?[0-9])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD4_PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

	// WELCOME MESSAGE
	public static void main(String args[]) {
		System.out.println("WELL COME USER REGISTRATION SYSTEM");
	}

	public boolean validateFirstName(String FirstName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN); // METHOD TO VALIDATE FIRST NAME
		boolean res = pattern.matcher(FirstName).matches();
		return res;

	}

	public boolean validateLastName(String LastName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);   // METHOD TO VALIDATE LAST NAME
		boolean res = pattern.matcher(LastName).matches();
		return res;
	}

	public boolean validateEmail(String Email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);    // METHOD TO VALIDATE EMAIL
		boolean res = pattern.matcher(Email).matches();
		return res;
	}

	public boolean validateMobileNo(String MobileNo) {
		Pattern pattern = Pattern.compile(MOBILE_PATTERN);     // METHOD TO VALIDATE MOBILE NUMBER
		boolean res = pattern.matcher(MobileNo).matches();
		return res;
	}

	public boolean validatePassword1(String Password1) {
		Pattern pattern = Pattern.compile(PASSWORD1_PATTERN);  // METHOD TO VALIDATE PASSWORD RULE ONE
		boolean res = pattern.matcher(Password1).matches();
		return res;
	}

	public boolean validatePassword2(String Password2) {
		Pattern pattern = Pattern.compile(PASSWORD2_PATTERN);   // METHOD TO VALIDATE PASSWORD RULE Two
		boolean res = pattern.matcher(Password2).matches();
		return res;
	}

	public boolean validatePassword3(String Password3) {
		Pattern pattern = Pattern.compile(PASSWORD3_PATTERN);    // METHOD TO VALIDATE PASSWORD RULE Three
		boolean res = pattern.matcher(Password3).matches();
		return res;
	}

	public boolean validatePassword4(String Password4) {
		Pattern pattern = Pattern.compile(PASSWORD4_PATTERN); // METHOD TO VALIDATE PASSWORD RULE FOURE
		boolean res = pattern.matcher(Password4).matches();
		return res;
	}
}
