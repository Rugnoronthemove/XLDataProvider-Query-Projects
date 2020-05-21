package com.demoaut.newtours.pages;

import com.demoaut.newtours.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    @FindBy(xpath = "//font[contains(text(),'Contact')]")
    WebElement _contactInformationText;

    @FindBy(name = "firstName")
    WebElement _firstName;

    @FindBy(name = "lastName")
    WebElement _lastName;

    @FindBy(name = "phone")
    WebElement _phone;

    @FindBy(name = "userName")
    WebElement _email;

    @FindBy(name = "address1")
    WebElement _address;

    @FindBy(name = "city")
    WebElement _city;

    @FindBy(name = "state")
    WebElement _stateProvince;

    @FindBy(name = "postalCode")
    WebElement _postalCode;

    @FindBy(name = "country")
    WebElement _country;

    @FindBy(name = "email")
    WebElement _userName;

    @FindBy(name = "password")
    WebElement _password;

    @FindBy(name = "confirmPassword")
    WebElement _confirmPassword;

    @FindBy(name = "register")
    WebElement _submitButton;

    public void verifyContactInformationText(String text) {
        Reporter.log(" Verify: " + text + " is displayed on the Registration page " + _contactInformationText.toString() + "<br>");
        verifyTextAssertEqualsMethod(_contactInformationText, text);
        log.info(" Verify: " + text + " is displayed on the Registration page " + _contactInformationText.toString());
    }

    public void enterFirstName(String fName) {
        Reporter.log(" Enter: " + fName + " in the First Name field " + _firstName.toString() + "<br>");
        sendTextToElement(_firstName, fName);
        log.info(" Enter: " + fName + " in the First Name field " + _firstName.toString());
    }

    public void enterLastName(String lName) {
        Reporter.log(" Enter: " + lName + " in the Last Name field " + _lastName.toString() + "<br>");
        sendTextToElement(_lastName, lName);
        log.info(" Enter: " + lName + " in the Last Name field " + _lastName.toString());
    }

    public void enterPhoneNo(String phNo) {
        Reporter.log(" Enter: " + phNo + " in the phone number field " + _phone.toString() + "<br>");
        sendTextToElement(_phone, phNo);
        log.info(" Enter: " + phNo + " in the phone number field " + _phone.toString());
    }

    public void enterEmail(String email) {
        Reporter.log(" Enter: " + email + " in the email field " + _email.toString() + "<br>");
        sendTextToElement(_email, email);
        log.info(" Enter: " + email + " in the email field " + _email.toString());
    }

    public void enterAddress(String add) {
        Reporter.log(" Enter: " + add + " in the address field " + _address.toString() + "<br>");
        sendTextToElement(_address, add);
        log.info(" Enter: " + add + " in the address field " + _address.toString());
    }

    public void enterCity(String city) {
        Reporter.log(" Enter: " + city + " in the city field " + _city.toString() + "<br>");
        sendTextToElement(_city, city);
        log.info(" Enter: " + city + " in the city field " + _city.toString());
    }

    public void enterState(String state) {
        Reporter.log(" Enter: " + state + " in the state field " + _stateProvince.toString() + "<br>");
        sendTextToElement(_stateProvince, state);
        log.info(" Enter: " + state + " in the state field " + _stateProvince.toString());
    }

    public void enterPostalCode(String poCode) {
        Reporter.log("Enter: " + poCode + " in the postal code field " + _postalCode.toString() + "<br>");
        sendTextToElement(_postalCode, poCode);
        log.info("Enter: " + poCode + " in the postal code field " + _postalCode.toString());
    }

    public void enterCountry(String country) {
        Reporter.log("Select: " + country + " from select country drop down " + _country.toString() + "<br>");
        selectByVisibleTextFromDropDown(_country, country);
        log.info("Select: " + country + " from select country drop down " + _country.toString());
    }

    public void enterUserName(String uName) {
        Reporter.log(" Enter: " + uName + " in the UserName field " + _userName.toString() + "<br>");
        sendTextToElement(_userName, uName);
        log.info(" Enter: " + uName + " in the UserName field " + _userName.toString());
    }

    public void enterPassword(String pass) {
        Reporter.log(" Enter: " + pass + " in the password field " + _password.toString() + "<br>");
        sendTextToElement(_password, pass);
        log.info(" Enter: " + pass + " in the password field " + _password.toString());
    }

    public void enterConfirmPassword(String coPass) {
        Reporter.log(" Enter: " + coPass + " in the confirm password field " + _confirmPassword.toString() + "<br>");
        sendTextToElement(_confirmPassword, coPass);
        log.info(" Enter: " + coPass + " in the confirm password field " + _confirmPassword.toString());
    }

    public void clickOnSubmitButton() {
        Reporter.log(" Click on Submit button: " + _submitButton.toString() + "<br>");
        clickOnElement(_submitButton);
        log.info(" Click on Submit button: " + _submitButton.toString());
    }

}

