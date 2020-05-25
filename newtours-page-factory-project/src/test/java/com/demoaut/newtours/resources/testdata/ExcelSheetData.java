package com.demoaut.newtours.resources.testdata;

import com.demoaut.newtours.excelutility.ExcelUtility;
import org.testng.annotations.DataProvider;

public class ExcelSheetData {

    public static final String FILE_PATH = System.getProperty("user.dir") +"/src/test/java/com/demoaut/newtours/resources/testdata/RegistrationSignInData.xlsx";



    @DataProvider(name = "RegistrationXLSheet")
    public Object[][] getDataXLRegistration() {

        try {
            ExcelUtility.setExcelFile(FILE_PATH,"Registration");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Object[][] data = ExcelUtility.getTestData("Registration");
        return data;
    }


    @DataProvider(name = "SignInXLSheet")
    public Object[][] getDataXLSignIn() {

        try {
            ExcelUtility.setExcelFile(FILE_PATH,"SignIn");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Object[][] data = ExcelUtility.getTestData("SignIn");
        return data;
    }


}
