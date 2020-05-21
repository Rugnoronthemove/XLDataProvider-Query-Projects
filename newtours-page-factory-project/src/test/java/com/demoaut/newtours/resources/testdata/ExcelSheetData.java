package com.demoaut.newtours.resources.testdata;

import com.demoaut.newtours.excelutility.ExcelUtility;
import org.testng.annotations.DataProvider;

public class ExcelSheetData {

    @DataProvider(name = "RegistrationXLSheet")
    public Object[][] getDataXLRegistration() {

        Object[][] data = ExcelUtility.getTestData("Registration");
        return data;
    }


    @DataProvider(name = "SignInXLSheet")
    public Object[][] getDataXLSignIn() {

        Object[][] data = ExcelUtility.getTestData("SignIn");
        return data;
    }


}
