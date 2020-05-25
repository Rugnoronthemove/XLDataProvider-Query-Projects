package com.demoaut.newtours.testsuite;

import com.demoaut.newtours.excelutility.ExcelUtility;
import com.demoaut.newtours.pages.HomePage;
import com.demoaut.newtours.pages.RegistrationCompletePage;
import com.demoaut.newtours.pages.RegistrationPage;
import com.demoaut.newtours.pages.SignOnPage;
import com.demoaut.newtours.resources.testdata.ExcelSheetData;
import com.demoaut.newtours.tesbase.TestBase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.demoaut.newtours.utility.Utility.getRandomString;

public class RegistrationSignOnTestXLSheetData extends TestBase {


    static String email = null;

/*    @BeforeClass(groups = {"Regression", "Smoke", "Sanity"})
    public void setExcel() {
        try {
            ExcelUtility.setExcelFile(FILE_PATH,"SignIn");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    HomePage homePage;
    SignOnPage signOnPage;
    RegistrationPage registrationPage;
    RegistrationCompletePage registrationCompletePage;


    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        signOnPage = new SignOnPage();
        registrationPage = new RegistrationPage();
        registrationCompletePage = new RegistrationCompletePage();

        email = "xyz" + getRandomString(2) + "@gmail.com";
    }





    @Test(groups = {"Regression", "Smoke", "Sanity"}, dataProvider = "SignInXLSheet", dataProviderClass = ExcelSheetData.class)
    public void userShouldSignOnSuccessfully(String username, String password) {
        homePage.clickOnSignOnLink();
        signOnPage.enterUserName(username);
        signOnPage.enterPassword(password);
        signOnPage.clickOnSubmitButton();
    }


    @Test(groups = {"Regression","Smoke","Sanity"},dataProvider ="RegistrationXLSheet",dataProviderClass = ExcelSheetData.class)
    public void userShouldRegisterSuccessfully(String fName, String lName, String phNo, String add, String city, String state, String pCode, String country, String uName, String pass) {
        homePage.clickOnRegisterLink();
        registrationPage.enterFirstName(fName);
        registrationPage.enterLastName(lName);
        registrationPage.enterPhoneNo(phNo);
        registrationPage.enterEmail(email);
        registrationPage.enterAddress(add);
        registrationPage.enterCity(city);
        registrationPage.enterState(state);
        registrationPage.enterPostalCode(pCode);
        registrationPage.enterCountry(country);
        registrationPage.enterUserName(uName);
        registrationPage.enterPassword(pass);
        registrationPage.enterConfirmPassword(pass);
        registrationPage.clickOnSubmitButton();
        registrationCompletePage.verifySignInText("SIGN-OFF");
    }

}
