package com.vangoghmuseum.tests.steps;

import com.google.inject.Inject;
import com.vangoghmuseum.tests.po.HomePage;
import io.qameta.allure.Step;
import lombok.Data;

@Data
public class HomePageSteps {
    @Inject
    private HomePage home;

    @Inject
    private GenericSteps generic;

    @Step("Click on the Collections link")
    public void clickOnCollectionsLink() {
        home.openCollections();
    }

    @Step("Open the Home page")
    public void openPage() {
        home.openPage();
        generic.acceptCookies();
    }
}
