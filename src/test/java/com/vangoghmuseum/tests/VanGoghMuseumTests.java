package com.vangoghmuseum.tests;

import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Story("Verifying main test cases")
public class VanGoghMuseumTests extends AbstractTest {

    @Test(description = "TC#1 Verifying that the Collection page in displayed")
    public void verifyingCollectionPage() {
        step.home.openPage();
        step.home.clickOnCollectionsLink();
        step.collection.assertPage();
    }

    @Test(description = "TC#2 Verifying that the search results are presented")
    public void verifyingSearchingCollections() {
        step.collection.openPageUrl();
        step.collection.enterSearchValue(data.search.getDefaultSearchQuery().getSearchKey());
        step.collection.clickOnSearchIcon();
        step.collection.assertSearchResultsCount(data.search.getDefaultSearchQuery().getSearchResultCont());
    }

    @Test(description = "TC#3 Verifying the object data on the Art Object details page")
    public void verifyingDetails() {
        step.collection.openPageUrl();
        step.collection.enterSearchValue(data.search.getDefaultSearchQuery().getSearchKey());
        step.collection.clickOnSearchIcon();
        step.collection.clickOnFirstObject();
        step.objectDetails.assertObjectData(data.dataObject.getSearchedArtObject());
    }

}
