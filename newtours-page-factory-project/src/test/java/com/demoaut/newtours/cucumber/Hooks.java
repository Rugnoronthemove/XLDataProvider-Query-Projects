package com.demoaut.newtours.cucumber;

import com.cucumber.listener.Reporter;
import com.demoaut.newtours.basepage.BasePage;
import com.demoaut.newtours.browserselector.BrowserSelector;
import com.demoaut.newtours.loadproperty.LoadProperty;
import com.demoaut.newtours.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Reporter.assignAuthor("HybridFrameWork","Cucumber","Page Factory");
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if(scenario.isFailed()){
           String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
