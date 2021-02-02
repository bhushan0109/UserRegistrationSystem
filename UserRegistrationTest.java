package com.user.registration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest { // Test-Cases Class

	@Test // First-Name Test Method
	public void firstName() {
		UserValidater UserValidater = new UserValidater();
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			result = UserValidater.validateFirstName();
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

	@Test // last-Name Test Method
	public void lastName() {
		UserValidater UserValidater = new UserValidater();
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			result = UserValidater.validateLastName();
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

	@Test // Email Test Method
	public void Email() {
		UserValidater UserValidater = new UserValidater();
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			result = UserValidater.validateEmail();
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

	@Test // mobile number Test Method
	public void mobilenumber() {
		UserValidater UserValidater = new UserValidater();
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			result = UserValidater.validateMobileNo();
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

	@Test // password Test Method
	public void password() {
		UserValidater UserValidater = new UserValidater();
		boolean result = false;
		try {
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			result = UserValidater.validatePassword4();
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

}
