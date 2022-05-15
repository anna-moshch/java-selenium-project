package com.vangoghmuseum.tests.utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.vangoghmuseum.tests.utils.TestConfig.testConfigurations;

public class WebDriverFactory {
    private WebDriver driver;

    public WebDriverFactory() {
        ChromeOptions options = new ChromeOptions();
        switch (testConfigurations.os()) {
            case "mac":
                System.setProperty("webdriver.chrome.driver", "driver/chrome/macOs/chromedriver");
                break;

            case "win":
                System.setProperty("webdriver.chrome.driver", "driver/chrome/win/chromedriver.exe");
                options.addArguments("--disable-gpu");
                break;
            case "linux":
                System.setProperty("webdriver.chrome.driver", "driver/chrome/linux/chromedriver");
                options.addArguments("--headless");
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("There is no test os implementation for: '%s'", testConfigurations.os()));
        }
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920,1080");
        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
