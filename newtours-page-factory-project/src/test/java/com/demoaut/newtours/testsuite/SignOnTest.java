package com.demoaut.newtours.testsuite;

import com.demoaut.newtours.excelutility.ExcelUtility;
import com.demoaut.newtours.pages.HomePage;
import com.demoaut.newtours.pages.SignOnPage;
import com.demoaut.newtours.resources.testdata.ExcelSheetData;
import com.demoaut.newtours.tesbase.TestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignOnTest extends TestBase {

    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/com/demoaut/newtours/resources/testdata/RegistrationSignInData.xlsx";

    @BeforeClass(groups = {"Regression", "Smoke", "Sanity"})
    public void setExcel() {
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "SignIn");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    HomePage homePage;
    SignOnPage signOnPage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        signOnPage = new SignOnPage();
    }


    @Test(groups = {"Regression", "Smoke", "Sanity"})
    public void userShouldNavigateToSignOnPageSuccessfully() {
        homePage.clickOnSignOnLink();
        signOnPage.verifySignOnText("Welcome back to Mercury Tours!");
    }

    @Test(groups = {"Regression", "Smoke", "Sanity"}, dataProvider = "SignInXLSheet", dataProviderClass = ExcelSheetData.class)
    public void userShouldSignOnSuccessfully(String username, String password) {
        homePage.clickOnSignOnLink();
        signOnPage.enterUserName(username);
        signOnPage.enterPassword(password);
        signOnPage.clickOnSubmitButton();
    }
}
