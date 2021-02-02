package com.user.registration;

import java.util.regex.Pattern;

public class UserRegistrationSystem {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
	private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
	private static final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD2_PATTERN = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD3_PATTERN = "(?=.?[A-Z])(?=.?[0-9])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD4_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";

	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		try {
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			boolean res = pattern.matcher(firstName).matches();
			return res;
		} catch (Exception e) {
			throw new UserRegistrationException("Invalid Entry!");
		}

	}

	public boolean validateLastName(String lastName) throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(NAME_PATTERN);
			boolean res = pattern.matcher(lastName).matches();
			return res;
		} catch (Exception e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}

	public boolean validateEmail(String email) throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			boolean res = pattern.matcher(email).matches();
			return res;
		} catch (Exception e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}

	public boolean validateMobileNo(String mobileNumber) throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(MOBILE_PATTERN);
			boolean res = pattern.matcher(mobileNumber).matches();
			return res;
		} catch (Exception e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		try {

			Pattern pattern = Pattern.compile(PASSWORD4_PATTERN);
			boolean res = pattern.matcher(password).matches();
			return res;
		} catch (Exception e) {
			throw new UserRegistrationException("Invalid Entry!");
		}
	}
}
