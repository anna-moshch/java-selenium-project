package com.vangoghmuseum.tests.po.en;

import com.vangoghmuseum.tests.po.ObjectDetailsPage;
import com.vangoghmuseum.tests.po.ObjectDetailsPageBase;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectDetailsPageEn extends ObjectDetailsPageBase implements ObjectDetailsPage {
    private By openObjectData = By.xpath("//button[@aria-label = 'Open Object data']");

    public ObjectDetailsPageEn(WebDriverWrapper driver) {
        super(driver);
    }

    @Override
    public void assertObjectData(Map<String, String> expectedResult) {
        driver.scrollToElement(openObjectData);
        driver.scrollDown();
        getOpenObjectData(openObjectData);
        assertThat(getContent()).isEqualTo(expectedResult);
    }
}
