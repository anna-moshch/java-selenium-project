package com.vangoghmuseum.tests.steps;

import com.google.inject.Inject;
import com.vangoghmuseum.tests.po.GenericActions;
import lombok.Data;

@Data
class GenericSteps {
    @Inject
    private GenericActions generic;

    void acceptCookies() {
        generic.acceptCookies();
    }
}
