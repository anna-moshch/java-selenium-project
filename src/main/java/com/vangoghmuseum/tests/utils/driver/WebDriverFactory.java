package com.vangoghmuseum.tests.utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import static com.vangoghmuseum.tests.utils.TestConfig.testConfigurations;

public class WebDriverFactory {
    private WebDriver driver;

    public WebDriverFactory() {

        switch (testConfigurations.os()) {
            case "mac":
                System.setProperty("webdriver.chrome.driver", "driver/chrome/macOs/chromedriver");
                break;

            case "win":
                System.setProperty("webdriver.chrome.driver", "driver/chrome/win/chromedriver.exe");
                break;
            case "linux":
                System.setProperty("webdriver.chrome.driver", "driver/chrome/linux/chromedriver");
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("There is no test os implementation for: '%s'", testConfigurations.os()));
        }
        Map<String, Object> chromePrefs = new HashMap<>();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--test-type");
        options.addArguments("--disable-extensions"); //to disable browser extension popup
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
