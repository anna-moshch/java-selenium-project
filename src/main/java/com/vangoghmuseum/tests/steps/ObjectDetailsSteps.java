package com.vangoghmuseum.tests.steps;

import com.google.inject.Inject;
import com.vangoghmuseum.tests.po.ObjectDetailsPage;
import io.qameta.allure.Step;
import lombok.Data;

import java.util.Map;

@Data
public class ObjectDetailsSteps {

    @Inject
    private ObjectDetailsPage objectDetails;

    @Step("Assert all data object of the Art Object")
    public void assertObjectData(Map<String, String> expectedResult) {
        objectDetails.assertObjectData(expectedResult);
    }
}
