package com.vangoghmuseum.tests.utils;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:application.properties"})
public interface TestProperties extends Config {
    @Key("url")
    String url();
    @Key("localization")
    String localization();
    @Key("os")
    String os();
}
