package com.user.registration;

import java.util.regex.Pattern;
@FunctionalInterface 
interface UserValidator {
	boolean validate(String s);
}

public class UserRegistrationSystem {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
	private static final String MOBILE_PATTERN = "[91]+[\s]+[0-9]{10}";
	private static final String PASSWORD1_PATTERN = "[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD2_PATTERN = "(?=.*?[A-Z])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD3_PATTERN = "(?=.?[A-Z])(?=.?[0-9])[a-z A-Z 0-9]{8,}";
	private static final String PASSWORD4_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";

	//used lambda fuction
	UserValidator validateFirstName = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches()); 
    UserValidator validateLastName = (s) -> (Pattern.compile(NAME_PATTERN).matcher(s).matches());
    UserValidator validateEmail = (s) -> (Pattern.compile(EMAIL_PATTERN).matcher(s).matches());
    UserValidator validateMobile = (s) -> (Pattern.compile(MOBILE_PATTERN).matcher(s).matches());
    UserValidator validatePassword = (s) -> (Pattern.compile(PASSWORD4_PATTERN).matcher(s).matches());
}
