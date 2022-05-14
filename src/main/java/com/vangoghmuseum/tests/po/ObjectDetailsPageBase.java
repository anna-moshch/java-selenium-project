package com.vangoghmuseum.tests.po;

import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ObjectDetailsPageBase implements ObjectDetailsPage {

    protected WebDriverWrapper driver;

    protected ObjectDetailsPageBase(WebDriverWrapper driver) {
        this.driver = driver;
    }

    protected void getOpenObjectData(By element) {
        driver.waitElementToBeClickable(element).click();
    }

    protected Map<String, String> getContent() {
        List<WebElement> elements = driver.getElements(By.xpath("//*[@class='definition-list-item-label']"));
        Map<String, String> result = new HashMap<>();

        for (int i = 1; i <= elements.size(); i++) {
            result.put(driver.getElement(By.xpath("(//*[@class='definition-list-item-label'])[" + i + "]")).getText(),
                    driver.getElement(By.xpath("(//*[@class='definition-list-item-value'])[" + i + "]")).getText());
        }
        return result;
    }


}
