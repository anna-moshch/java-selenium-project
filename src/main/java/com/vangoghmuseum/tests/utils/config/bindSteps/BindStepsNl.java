package com.vangoghmuseum.tests.utils.config.bindSteps;

import com.google.inject.AbstractModule;
import com.vangoghmuseum.tests.po.CollectionPage;
import com.vangoghmuseum.tests.po.GenericActions;
import com.vangoghmuseum.tests.po.HomePage;
import com.vangoghmuseum.tests.po.ObjectDetailsPage;
import com.vangoghmuseum.tests.po.nl.CollectionPageNl;
import com.vangoghmuseum.tests.po.nl.HomePageNl;
import com.vangoghmuseum.tests.po.nl.ObjectDetailsPageNL;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;

public class BindStepsNl extends AbstractModule {
    private WebDriverWrapper driverWrapper;

    public BindStepsNl(WebDriverWrapper driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    @Override
    protected void configure() {
        bind(HomePage.class).toInstance(new HomePageNl(driverWrapper));
        bind(GenericActions.class).toInstance(new GenericActions(driverWrapper));
        bind(CollectionPage.class).toInstance(new CollectionPageNl(driverWrapper));
        bind(ObjectDetailsPage.class).toInstance(new ObjectDetailsPageNL(driverWrapper));

    }
}
