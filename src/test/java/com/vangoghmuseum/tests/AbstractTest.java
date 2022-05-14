package com.vangoghmuseum.tests;

import com.vangoghmuseum.tests.steps.Steps;
import com.vangoghmuseum.tests.testData.TestData;
import com.vangoghmuseum.tests.utils.config.ConfigHolder;
import com.vangoghmuseum.tests.utils.driver.WebDriverFactory;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.vangoghmuseum.tests.utils.TestConfig.testConfigurations;

public abstract class AbstractTest {
    private WebDriverFactory driverWrapper;
    Steps step;
    TestData data;

    @BeforeClass(alwaysRun = true)
    public void init() {
        driverWrapper = new WebDriverFactory();
        WebDriverWrapper driver = new WebDriverWrapper(driverWrapper);
        step = new ConfigHolder().getInstance(driver, testConfigurations).getTestSteps();
        data = new ConfigHolder().getInstance(driver, testConfigurations).getTestData();
    }

    @AfterClass
    public void close() {
        driverWrapper.getDriver().quit();
    }
}