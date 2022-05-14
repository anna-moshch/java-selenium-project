package com.vangoghmuseum.tests.steps;

import com.google.inject.Inject;

public class Steps {
    @Inject
    public CollectionPageSteps collection;

    @Inject
    public HomePageSteps home;

    @Inject
    public ObjectDetailsSteps objectDetails;
}
