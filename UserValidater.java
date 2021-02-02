package com.user.registration;

import java.util.regex.Pattern;

public class UserValidater {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
	private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
	private static final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD2_PATTERN = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD3_PATTERN = "(?=.?[A-Z])(?=.?[0-9])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD4_PATTERN = "(?=.?[A-Z])(?=(.[a-z]){1,})(?=(.[\\d]){1,})(?=(.[\\W]){1,})(?!.*\\s).{8,}$";

	public boolean validateFirstName() throws UserRegistrationException {
		try {
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			boolean res = pattern.matcher("bhusha").matches();
			return res;
		} catch (AssertionError e) {
			throw new UserRegistrationException("Invalid Entry!");
		}

	}

	public boolean validateLastName() throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(NAME_PATTERN);
			boolean res = pattern.matcher("patil").matches();
			return res;
		} catch (AssertionError e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}

	public boolean validateEmail() throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			boolean res = pattern.matcher("bhushan@@gmail.com").matches();
			return res;
		} catch (AssertionError e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}

	public boolean validateMobileNo() throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(MOBILE_PATTERN);
			boolean res = pattern.matcher("89768912").matches();
			return res;
		} catch (AssertionError e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}

	public boolean validatePassword4() throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(PASSWORD4_PATTERN);
			boolean res = pattern.matcher("hvfjhvf").matches();
			return res;
		} catch (AssertionError e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}
}
