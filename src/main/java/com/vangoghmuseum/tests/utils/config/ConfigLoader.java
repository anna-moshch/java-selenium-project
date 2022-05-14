package com.vangoghmuseum.tests.utils.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.vangoghmuseum.tests.steps.Steps;
import com.vangoghmuseum.tests.testData.TestData;
import com.vangoghmuseum.tests.utils.config.bindData.BindDataEn;
import com.vangoghmuseum.tests.utils.config.bindData.BindDataNl;
import com.vangoghmuseum.tests.utils.config.bindSteps.BindStepsEn;
import com.vangoghmuseum.tests.utils.config.bindSteps.BindStepsNl;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;

class ConfigLoader {

    Steps loadTestSteps(WebDriverWrapper driverWrapper, String localization) {
        Injector injector;
        Steps steps;
        switch (localization) {
            case "nl":
                injector = Guice.createInjector(new BindStepsNl(driverWrapper));
                steps = injector.getInstance(Steps.class);
                break;
            case "en":
                injector = Guice.createInjector(new BindStepsEn(driverWrapper));
                steps = injector.getInstance(Steps.class);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("There is no test steps implementation for: '%s'", localization));
        }
        return steps;
    }

    TestData loadTestData(String localization) {
        Injector injector;
        TestData data;
        switch (localization) {
            case "nl":
                injector = Guice.createInjector(new BindDataNl());
                data = injector.getInstance(TestData.class);
                break;
            case "en":
                injector = Guice.createInjector(new BindDataEn());
                data = injector.getInstance(TestData.class);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("There is no test data implementation for: '%s'", localization));
        }
        return data;
    }
}
