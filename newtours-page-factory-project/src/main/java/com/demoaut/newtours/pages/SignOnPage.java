package com.demoaut.newtours.pages;

import com.demoaut.newtours.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignOnPage extends Utility {

    private final static Logger log = LogManager.getLogger(SignOnPage.class.getName());

//    @FindBy(xpath = "//img[@src='/images/masts/mast_signon.gif']")
    @FindBy(xpath = "//b[contains(text(),'Welcome back to')]")
    WebElement _signOnText;

    @FindBy(name = "userName")
    WebElement _userNameField;

    @FindBy(name = "password")
    WebElement _passwordField;

    @FindBy(name = "login")
    WebElement _submitButton;

    public void verifySignOnText(String text) {
        Reporter.log(" Verify: " + text + " is displayed on SignOnPage " + _signOnText.toString() + "<br>");
        verifyTextAssertEqualsMethod(_signOnText,text);
        log.info(" Verify: " + text + " is displayed on SignOnPage " + _signOnText.toString() + "<br>");
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

    public void clickOnSubmitButton() {
        Reporter.log(" Clicking on SUBMIT button: " + _submitButton.toString() + "<br>");
        clickOnElement(_submitButton);
        log.info(" Clicking on SUBMIT button: " + _submitButton.toString());
    }


}
