package com.vangoghmuseum.tests.po.nl;

import com.vangoghmuseum.tests.po.ObjectDetailsPage;
import com.vangoghmuseum.tests.po.ObjectDetailsPageBase;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectDetailsPageNL extends ObjectDetailsPageBase implements ObjectDetailsPage {

    public ObjectDetailsPageNL(WebDriverWrapper driver) {
        super(driver);
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

}
