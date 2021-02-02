package com.user.registration;

import org.junit.Assert;
import org.junit.Test;

//all j unit method testing part
public class UserRegistrationTest {
	UserRegistrationSystem userRegistration = new UserRegistrationSystem();

	@Test
	public void givenFirstNameHappy() {
		boolean result = true;
		try {
			result = userRegistration.validateFirstName("Bhu");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstNameSad() {
		boolean result = false;
		try {
			result = userRegistration.validateFirstName("jd");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastNameHappy() {
		boolean result = true;
		try {
			result = userRegistration.validateLastName("Pat");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastNameSad() {
		boolean result = false;
		try {
			result = userRegistration.validateLastName("pgddj");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailHappy() {
		boolean result = true;
		try {
			result = userRegistration.validateEmail("bhupatil0001@gmail.com");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailSad() {
		boolean result = false;
		try {
			result = userRegistration.validateEmail("bhudggdxghd");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNoHappy() {
		boolean result = true;
		try {
			result = userRegistration.validateMobileNo("91 5678976545");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNoSad() {
		boolean result = false;
		try {
			result = userRegistration.validateMobileNo("78363636836");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenPasswordFourHappy() {
		boolean result = true;
		try {
			result = userRegistration.validatePassword("B1@12s45");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordFourSad() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("fhskdfgk");
		} catch (UserRegistrationException e) {

			e.printStackTrace();
		}
		Assert.assertFalse(result);
	}
}
