package com.vangoghmuseum.tests.po;

import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class CollectionPageBase implements CollectionPage {
    protected WebDriverWrapper driver;

    private static String filterList = "//*[@class='list-filters']";

    public CollectionPageBase(WebDriverWrapper driver) {
        this.driver = driver;
    }


    @Override
    public void enterSearchValue(String searchKey) {
        getSearchInput().sendKeys(searchKey);
    }

    @Override
    public void clickOnSearchIcon() {
        getSearchIcon().click();
    }

    @Override
    public void assertSearchResultsCount(int count) {
        assertThat(Integer.parseInt(getResultCount().getText())).isGreaterThan(count);
        scrollToViewAllResults(count);
        assertThat(getArtObjectsInResults().size()).isGreaterThan(count);
    }

    @Override
    public void clickOnFirstObject() {
        getArtObjectsInResults().get(0).click();
    }


    protected WebElement getResultText() {
        return driver.waitElementToBeDisplayed(By.xpath("//*[@class='collection-art-object-list-results']"));
    }

    protected WebElement getResultCount() {
        return driver.waitElementToBeDisplayed(By.xpath("//*[@class='results']"));
    }

    protected List<WebElement> getArtObjectsInResults() {
        return driver.getElements(By.xpath("//div[@role='article']"));
    }

    protected WebElement getPageHeader() {
        return driver.waitElementToBeDisplayed(By.xpath("//*[@class='heading-1 page-header-heading']"));
    }

    protected WebElement getSearchInput() {
        return driver.waitElementToBeDisplayed(By.xpath(filterList + "//*[@class='search-field-input']"));
    }

    protected WebElement getSearchIcon() {
        return driver.waitElementToBeClickable(By.xpath(filterList + "//*[@class='icon-search']"));
    }

    protected WebElement getGridIncreaseIcon() {
        return driver.waitElementToBeDisplayed(By.xpath(filterList + "//*[@href='#icon-grid-increase']"));
    }


    protected WebElement getGridDecreaseIcon() {
        return driver.waitElementToBeDisplayed(By.xpath(filterList + "//*[@class='icon-grid-decrease']"));
    }


    protected WebElement getSliderIcon() {
        return driver.waitElementToBeDisplayed(By.xpath(filterList + "//*[@class='slider']"));
    }

    protected WebElement getFilterIcon() {
        return driver.waitElementToBeDisplayed(By.xpath(filterList + "//*[@aria-label='Open filters']"));
    }

    private void scrollToViewAllResults(int count) {
        for (int i = 1; i <= count; i++) {
            driver.scrollDown();
            if (getArtObjectsInResults().size() >= count) {
                break;
            }
        }
    }

}
