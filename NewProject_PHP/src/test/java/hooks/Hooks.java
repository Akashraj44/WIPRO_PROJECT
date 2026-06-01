package hooks;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {

    @Before

    public void setup() {

        DriverFactory.initDriver(

        ConfigReader.getProperty(
        "browser"));
    }

    @After

    public void tearDown() {

        DriverFactory.quitDriver();
    }
}