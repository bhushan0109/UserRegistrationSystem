package com.user.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationSystem UserRegistrationSystem = new UserRegistrationSystem();

	@Test
	public void givenFirstNameValid() {
		boolean result = true;
		result = UserRegistrationSystem.validateFirstName.validate("Bhush");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstNameInvalid() {
		boolean result = false;
		result = UserRegistrationSystem.validateFirstName.validate("bush");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastNameValid() {
		boolean result = true;
		result = UserRegistrationSystem.validateLastName.validate("Pat");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastNameInvalid() {
		boolean result = false;
		result = UserRegistrationSystem.validateLastName.validate("pat");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailValid() {
		boolean result = true;
		result = UserRegistrationSystem.validateEmail.validate("bhupatil0001@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailInvalid() {
		boolean result = false;
		result = UserRegistrationSystem.validateEmail.validate("bhushan@@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNoValid() {
		boolean result = true;
		result = UserRegistrationSystem.validateMobile.validate("91 6737726849");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNoInValid() {
		boolean result = false;
		result = UserRegistrationSystem.validateMobile.validate("6737726849");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPasswordValid() {
		boolean result = true;
		result = UserRegistrationSystem.validatePassword.validate("A1@12g449");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordInValid() {
		boolean result = false;
		result = UserRegistrationSystem.validatePassword.validate("A2g449");
		Assert.assertFalse(result);
	}

}
