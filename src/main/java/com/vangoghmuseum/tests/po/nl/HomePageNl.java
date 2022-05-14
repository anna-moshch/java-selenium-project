package com.vangoghmuseum.tests.po.nl;

import com.vangoghmuseum.tests.po.HomePage;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;

import static com.vangoghmuseum.tests.utils.TestConfig.testConfigurations;

public class HomePageNl implements HomePage {
    private WebDriverWrapper driver;

    public HomePageNl(WebDriverWrapper driver) {
        this.driver = driver;
    }
    private By collectionsLink = By.xpath("//*[@href = '/nl/collectie']");

    @Override
    public void openCollections() {
        driver.scrollToElement(collectionsLink);
        driver.waitElementToBeClickable(collectionsLink).click();
    }

    @Override
    public void openPage(){
        driver.open(testConfigurations.url());
    }

}
