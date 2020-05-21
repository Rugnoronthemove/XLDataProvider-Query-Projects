package com.demoaut.newtours.pages;

import com.demoaut.newtours.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationCompletePage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationCompletePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'SIGN-OFF')]")
    WebElement _signInText;

    public void verifySignInText(String signInText) {
        Reporter.log(" Verify: " + signInText + " is displayed on the Registration completion page " + _signInText.toString() + "<br>");
        verifyTextAssertEqualsMethod(_signInText, signInText);
        log.info(" Verify: " + signInText + " is displayed on the Registration completion page " + _signInText.toString());
    }
}
