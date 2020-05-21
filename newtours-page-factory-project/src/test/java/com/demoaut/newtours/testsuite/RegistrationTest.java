package com.demoaut.newtours.testsuite;

import com.demoaut.newtours.excelutility.ExcelUtility;
import com.demoaut.newtours.pages.HomePage;
import com.demoaut.newtours.pages.RegistrationCompletePage;
import com.demoaut.newtours.pages.RegistrationPage;
import com.demoaut.newtours.resources.testdata.ExcelSheetData;
import com.demoaut.newtours.resources.testdata.TestData;
import com.demoaut.newtours.tesbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.demoaut.newtours.utility.Utility.getRandomString;

public class RegistrationTest extends TestBase {

    public static final String FILE_PATH = System.getProperty("user.dir") +"/src/test/java/com/demoaut/newtours/resources/testdata/RegistrationSignInData.xlsx";

    static String email = null;

    @BeforeClass(groups = {"Regression", "Smoke", "Sanity"})
    public void setExcel() {
        try {
            ExcelUtility.setExcelFile(FILE_PATH,"Registration");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    HomePage homePage;
    RegistrationPage registrationPage;
    RegistrationCompletePage registrationCompletePage;


    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
        registrationCompletePage = new RegistrationCompletePage();
        email = "xyz" + getRandomString(2) + "@gmail.com";
    }

    @Test(groups = {"Regression", "Smoke", "Sanity"}, dataProvider = "Registration", dataProviderClass = TestData.class)
    public void userShouldCompleteRegistrationSuccessfully(String fName, String lName, String phNo, String add, String city, String state, String pCode, String country, String uName, String pass) {
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
