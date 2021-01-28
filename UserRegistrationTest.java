package com.user.registration;

import org.junit.Assert;
import org.junit.Test;
//all junit method testing part
public class UserRegistrationTest {
    UserValidater userRegistration=new UserValidater();
    @Test
    public void givenFirstNameHappy(){
        boolean result=userRegistration.validateFirstName("Bhush");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstNameSad(){
        boolean result=userRegistration.validatePassword4("bhush");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHappy(){
        boolean result=userRegistration.validateLastName("Patil");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastNameSad(){
        boolean result=userRegistration.validateLastName("patil");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmailHappy(){
        boolean result=userRegistration.validateEmail("bhupatil0001@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailSad(){
        boolean result=userRegistration.validateEmail("bhupatil0001gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNoHappy(){
        boolean result=userRegistration.validateMobileNo("91 8975891291");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNoSad(){
        boolean result=userRegistration.validateMobileNo("8975891291");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordOneHappy(){
        boolean result=userRegistration.validatePassword1("abcdbd34");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordOneSad(){
        boolean result=userRegistration.validatePassword1("fhfdhg");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordTwoHappy(){
        boolean result=userRegistration.validatePassword2("Aghtjkyf");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordTwoSad(){
        boolean result=userRegistration.validatePassword2("ghjkiuyh");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordThreeHappy(){
        boolean result =userRegistration.validatePassword3("1Abhujkg");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordThreeSad(){
        boolean result=userRegistration.validatePassword3("Agjgtyfg");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPasswordFourHappy(){
        boolean result=userRegistration.validatePassword4("@A1hjkih");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPasswordFourSad(){
        boolean result=userRegistration.validatePassword4("ghjuykhg");
        Assert.assertFalse(result);
    }
}
