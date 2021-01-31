package com.user.registration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

//This test class is used to all possible email formats
public class UserRegistrationTest {

	public String testEmails;
	public boolean expectedResult;

	public UserRegistrationTest(String email, boolean expectedResult) {
		this.testEmails = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100", false }, { "abc", false }, { "abc@.com.my", false }

		});
	}

	@Test
	public void givenEmail_whenProper_shouldReturnTrue() {
		try {
			UserValidater userRegistration = new UserValidater();
			boolean result = userRegistration.validateEmail(this.testEmails);
			Assert.assertEquals(this.expectedResult, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

}
