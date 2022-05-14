package com.vangoghmuseum.tests.po;

public interface CollectionPage {

    void assertPage();

    void openPageUrl();

    void enterSearchValue(String searchKey);

    void clickOnSearchIcon();

    void assertSearchResultsCount(int count);

    void clickOnFirstObject();


}
