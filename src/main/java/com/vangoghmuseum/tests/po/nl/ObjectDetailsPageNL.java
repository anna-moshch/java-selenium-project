package com.vangoghmuseum.tests.po.nl;

import com.vangoghmuseum.tests.po.ObjectDetailsPage;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectDetailsPageNL implements ObjectDetailsPage {
    private WebDriverWrapper driver;

    public ObjectDetailsPageNL(WebDriverWrapper driver) {
        this.driver = driver;
    }

    @Override
    public void assertObjectData(Map<String, String> expectedResult) {
        driver.scrollToElement(By.xpath("//button[@aria-label = 'Open Objectgegevens']"));
        driver.scrollDown();
        getOpenObjectData();
        assertThat(getContent()).isEqualTo(expectedResult);

    }

    private void getOpenObjectData() {
        driver.waitElementToBeClickable(By.xpath("//button[@aria-label = 'Open Objectgegevens']")).click();
    }

    private Map<String, String> getContent() {
        List<WebElement> elements = driver.getElements(By.xpath("//*[@class='definition-list-item-label']"));
        Map<String, String> result = new HashMap<>();

        for (int i = 1; i <= elements.size(); i++) {
            result.put(driver.getElement(By.xpath("(//*[@class='definition-list-item-label'])[" + i + "]")).getText(),
                    driver.getElement(By.xpath("(//*[@class='definition-list-item-value'])[" + i + "]")).getText());
        }
        return result;
    }
}
