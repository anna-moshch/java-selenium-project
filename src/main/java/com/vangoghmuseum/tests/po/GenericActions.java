package com.vangoghmuseum.tests.po;

import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;

public class GenericActions {
    private WebDriverWrapper driver;

    private By acceptCookiesButton = By.xpath("//button[@class = 'cookie-banner-button btn']");

    public GenericActions(WebDriverWrapper driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        if (driver.getElement(acceptCookiesButton).isDisplayed()) {
            driver.waitElementToBeClickable(acceptCookiesButton).click();
        }
    }
}
