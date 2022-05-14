package com.vangoghmuseum.tests.utils.config.bindData;

import com.google.inject.AbstractModule;
import com.vangoghmuseum.tests.testData.DataObjectTestData;
import com.vangoghmuseum.tests.testData.SearchTestData;
import com.vangoghmuseum.tests.testData.nl.DataObjectTestDataNl;
import com.vangoghmuseum.tests.testData.nl.SearchTestDataNl;

public class BindDataNl extends AbstractModule {

    @Override
    protected void configure() {
        bind(DataObjectTestData.class).to(DataObjectTestDataNl.class);
        bind(SearchTestData.class).to(SearchTestDataNl.class);
    }
}
