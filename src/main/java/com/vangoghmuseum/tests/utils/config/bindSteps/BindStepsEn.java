package com.vangoghmuseum.tests.utils.config.bindSteps;

import com.google.inject.AbstractModule;
import com.vangoghmuseum.tests.po.CollectionPage;
import com.vangoghmuseum.tests.po.GenericActions;
import com.vangoghmuseum.tests.po.HomePage;
import com.vangoghmuseum.tests.po.ObjectDetailsPage;
import com.vangoghmuseum.tests.po.en.CollectionPageEn;
import com.vangoghmuseum.tests.po.en.HomePageEn;
import com.vangoghmuseum.tests.po.en.ObjectDetailsPageEn;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;

public class BindStepsEn extends AbstractModule {
    private WebDriverWrapper driverWrapper;

    public BindStepsEn(WebDriverWrapper driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    @Override
    protected void configure() {
        bind(CollectionPage.class).toInstance(new CollectionPageEn(driverWrapper));
        bind(GenericActions.class).toInstance(new GenericActions(driverWrapper));
        bind(HomePage.class).toInstance(new HomePageEn(driverWrapper));
        bind(ObjectDetailsPage.class).toInstance(new ObjectDetailsPageEn(driverWrapper));

    }
}
