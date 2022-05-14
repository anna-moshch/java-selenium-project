package com.vangoghmuseum.tests.po.nl;

import com.vangoghmuseum.tests.po.CollectionPageBase;
import com.vangoghmuseum.tests.po.CollectionPage;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.assertj.core.api.SoftAssertions;

import static com.vangoghmuseum.tests.utils.TestConfig.testConfigurations;

public class CollectionPageNl extends CollectionPageBase implements CollectionPage {

    public CollectionPageNl(WebDriverWrapper driver) {
        super(driver);
    }

    @Override
    public void assertPage() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(getPageHeader().getText()).isEqualTo("Collectie");
        softly.assertThat(getSearchInput().getAttribute("placeholder")).isEqualTo("Zoek een kunstwerk");
        softly.assertThat(getSearchIcon().isDisplayed()).isEqualTo(true);
        softly.assertThat(getGridIncreaseIcon().isDisplayed()).isEqualTo(true);
        softly.assertThat(getGridDecreaseIcon().isDisplayed()).isEqualTo(true);
        softly.assertThat(getSliderIcon().getAttribute("aria-label")).isEqualTo("Grid grootte verkleinen of vergroten");
        softly.assertThat(getFilterIcon().getText().trim()).isEqualTo("Filter");
        softly.assertThat(getResultText().getText().trim()).contains(" resultaten");
        softly.assertThat(Integer.parseInt(getResultCount().getText())).isGreaterThan(0);
        softly.assertThat(getArtObjectsInResults().size()).isGreaterThan(0);
        softly.assertAll();
    }

    @Override
    public void openPageUrl() {
        driver.open(testConfigurations.url() + "/" + testConfigurations.localization() + "/collectie");
    }

}
