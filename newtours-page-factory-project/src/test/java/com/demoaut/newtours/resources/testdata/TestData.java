package com.demoaut.newtours.resources.testdata;

import com.demoaut.newtours.excelutility.ExcelUtility;
import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Registration")
    public Object[][] getDataRegistration() {

        return new Object[][]{
                {"Prime", "Testing", "1234567890", "117 high street", "london", "Hertfordshire", "wd17 2ta", "UNITED KINGDOM", "prime", "primetesting"}
        };
    }


}
