package com.vangoghmuseum.tests.utils.config.bindData;

import com.google.inject.AbstractModule;
import com.vangoghmuseum.tests.testData.DataObjectTestData;
import com.vangoghmuseum.tests.testData.SearchTestData;
import com.vangoghmuseum.tests.testData.en.DataObjectTestDataEn;
import com.vangoghmuseum.tests.testData.en.SearchTestDataEn;

public class BindDataEn extends AbstractModule {

    @Override
    protected void configure() {
        bind(DataObjectTestData.class).to(DataObjectTestDataEn.class);
        bind(SearchTestData.class).to(SearchTestDataEn.class);
    }
}
