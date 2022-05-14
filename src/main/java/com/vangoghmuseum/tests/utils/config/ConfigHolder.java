package com.vangoghmuseum.tests.utils.config;

import com.vangoghmuseum.tests.steps.Steps;
import com.vangoghmuseum.tests.testData.TestData;
import com.vangoghmuseum.tests.utils.TestProperties;
import com.vangoghmuseum.tests.utils.driver.WebDriverWrapper;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

@Slf4j
public class ConfigHolder {
    private final ReentrantLock lock = new ReentrantLock();
    private volatile ConfigHolder instance;
    @Getter
    private volatile Steps testSteps;
    @Getter
    private volatile TestData testData;

    public ConfigHolder() {
    }

    public ConfigHolder getInstance(WebDriverWrapper driverWrapper, TestProperties config) {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    log.info("Initializing ConfigHolder instance");
                    ConfigHolder configHolder = new ConfigHolder();
                    configHolder.testSteps = new ConfigLoader().loadTestSteps(driverWrapper, config.localization());
                    configHolder.testData = new ConfigLoader().loadTestData(config.localization());

                    instance = configHolder;
                    log.info("Initialization of the instance is completed");
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
