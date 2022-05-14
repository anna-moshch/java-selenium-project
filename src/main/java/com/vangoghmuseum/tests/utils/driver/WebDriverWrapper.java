package com.vangoghmuseum.tests.utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverWrapper {
    private WebDriverWait wait;
    private WebDriverFactory driver;

    public WebDriverWrapper(WebDriverFactory driver) {
        this.driver = driver;
        driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver.getDriver(), 10);
    }

    public WebElement getElement(By locator) {
        return driver.getDriver().findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return driver.getDriver().findElements(locator);
    }

    public WebElement waitElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitElementToBeDisplayed(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void scrollToElement(By locator) {
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].scrollIntoView(true)", getElement(locator));
    }

    public void scrollDown() {
        ((JavascriptExecutor) driver.getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //scrolling doesn't works without sleep
        sleep();
    }

    public void open(String URL) {
        driver.getDriver().get(URL);
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
