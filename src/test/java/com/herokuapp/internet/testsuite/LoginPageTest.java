package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    loginPage.enterUsernameID("tomsmith");
    loginPage.enterPasswordId("SuperSecretPassword!");
    loginPage.clickOnLoginButton();
        String expectedMessage = "Secure Area";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedMessage, "User Not Logged In");
    }

    @Test

    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUsernameID("tomsmith1");
        loginPage.enterPasswordId("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your username is invalid!";
        Assert.assertEquals(loginPage.invalidUserAndPasswordMessage(), expectedMessage, "User Logged in Successfully");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUsernameID("tomsmith");
        loginPage.enterPasswordId("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!";
        Assert.assertEquals(loginPage.invalidUserAndPasswordMessage(), expectedMessage, "User Logged in Successfully");

    }

    }

