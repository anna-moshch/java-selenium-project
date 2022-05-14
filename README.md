# Author
Anna Moshchenok

# Libraries
1. Selenium - framework for UI web testing
1. TestNG - test run/management engine
1. AssertJ - http://joel-costigliola.github.io/assertj/ - fluent assertion instead of testNG assertThat, allows using soft assertions
1. Guice https://github.com/google/guice - a dependency injection framework
1. Lombok - library to write less code


# Preconditions
Need to have JAVA installed in you system non lower that version 8 (if you use macOS run $ brew install --cask java8)
Need to have Maven installed (for MacOS run $ brew install maven)
Need to be installed Chrome browser version not less than 101.0.4951.15 (drivers for chrome are in the 'driver' directory; select OS in the application.properties file)
Need to be installed [IntelliJ IDEA](https://www.jetbrains.com/idea/)
Need to be installed allure to generate allure reports (For Mas OS brew install allure) https://docs.qameta.io/allure/#_installing_a_commandline

## IDEA
1. Install the lombok plugin from official market
   1. Open "Preferences"
   1. Open "Plugins"
   1. Search for "lombok" install it and restart the IDE
1. Enable annotation preprocessor for the opened project
   1. Open "Preferences"
   1. Search for "annotation processor"
   1. Click checkbox to enable annotation processor for current project


# Run tests
in the root of the project run the command: $ mvn clean test
to generate allure report after test running run the command: $ allure serve target/allure-results
or
run tests in the IDEA, they are here com.vangoghmuseum.tests.VanGoghMuseumTests



##About the project
Test implementation is based on interfaces. This approach allows runs the same test cases on different environments, localization, platforms
In this project, only an approach for different localizations was realized, but the project could be easily scaled to verify different environments, browsers, etc
To change the localization - set up localization in the 'application.properties' file. In this file the chromedriver for OS can be selected(mac OS by default).

##Project structure:
src/test/java/com/vangoghmuseum/tests - all tests are here
src/main/java/com/vangoghmuseum/tests/po - PageObjects are here; Interfaces are used in Tests Steps; not to be tied to the implementation of a specific page.
src/main/java/com/vangoghmuseum/tests/steps - There are all test steps for different pages
src/main/java/com/vangoghmuseum/tests/testData - There are all test data for different localizations
src/main/java/com/vangoghmuseum/tests/utils/config - There are configurations for bindings between interfaces and classes
src/main/java/com/vangoghmuseum/tests/utils/driver - There are driver factory and wrapper for easily working with elements




