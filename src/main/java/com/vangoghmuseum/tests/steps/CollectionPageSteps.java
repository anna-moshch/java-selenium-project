package com.vangoghmuseum.tests.steps;

import com.google.inject.Inject;
import com.vangoghmuseum.tests.po.CollectionPage;
import io.qameta.allure.Step;
import lombok.Data;

@Data
public class CollectionPageSteps {
    @Inject
    private CollectionPage collection;

    @Inject
    private GenericSteps generic;

    @Step("Assert that all elements are displayed on the Collections page")
    public void assertPage() {
        collection.assertPage();
    }

    @Step("Open the Collections page via url")
    public void openPageUrl() {
        collection.openPageUrl();
        generic.acceptCookies();
    }

    @Step("Enter the Search value")
    public void enterSearchValue(String searchKey) {
        collection.enterSearchValue(searchKey);
    }

    @Step("Click on the Search icon")
    public void clickOnSearchIcon() {
        collection.clickOnSearchIcon();
    }

    @Step("Click on the first art object")
    public void clickOnFirstObject() {
        collection.clickOnFirstObject();
    }

    @Step("Assert the not less than {count} art object are displayed in the result")
    public void assertSearchResultsCount(int count) {
        collection.assertSearchResultsCount(count);
    }
}
