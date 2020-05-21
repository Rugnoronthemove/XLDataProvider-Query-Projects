package com.demoaut.newtours.pages;

import com.demoaut.newtours.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "SIGN-ON")
    WebElement _signOnLink;

    @FindBy(linkText = "REGISTER")
    WebElement _registerLink;

    @FindBy(name = "userName")
    WebElement _userNameField;

    @FindBy(name = "password")
    WebElement _passwordField;

    @FindBy(name = "login")
    WebElement _signInButton;


    public void clickOnSignOnLink() {
        Reporter.log(" Clicking on SIGN-ON link: " + _signOnLink.toString() + "<br>");
        clickOnElement(_signOnLink);
        log.info(" Clicking on SIGN-ON link: " + _signOnLink.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log(" Clicking o n REGISTER link: " + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info(" Clicking o n REGISTER link " + _registerLink.toString());
    }

    public void enterUserName(String usName) {
        Reporter.log(" Enter: " + usName + " in the UserName field " + _userNameField.toString() + "<br>");
        sendTextToElement(_userNameField, usName);
        log.info(" Enter: " + usName + " in the UserName field " + _userNameField.toString());
    }

    public void enterPassword(String pass) {
        Reporter.log(" Enter: " + pass + " in the Password field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, pass);
        log.info(" Enter: " + pass + " in the Password field " + _passwordField.toString());
    }

    public void clickOnSignInButton() {
        Reporter.log(" Clicking on the Sign-In button: " + _signInButton.toString() + "<br>");
        clickOnElement(_signInButton);
        log.info(" Clicking on the Sign-In button: " + _signInButton.toString());
    }


}
