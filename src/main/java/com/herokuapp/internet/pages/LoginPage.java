package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//i[@class = 'fa fa-2x fa-sign-in']");

    By secureAreaText = By.xpath("//h2[text()=' Secure Area']");

    By invalidUsernamePasswordMessage = By.xpath("//div[@id='flash-messages']");

    public void enterUsernameID(String email){
        sendTextToElement(usernameField,email);
    }
    public void enterPasswordId(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getSecureAreaText() {
        return getTextFromElement(secureAreaText);
    }

    public String invalidUserAndPasswordMessage(){
        return getTextFromElement(invalidUsernamePasswordMessage).substring(0,25);
    }

}
