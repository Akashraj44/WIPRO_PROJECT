package Stepdefination;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

features =
"src/test/resources/Feature",

glue = {
"Stepdefination",
"hooks"

},

plugin = {

"pretty",

"html:Reports/CucumberReport.html"

},

tags = "@Smoke or @Regression"

)

public class TestRunner
extends AbstractTestNGCucumberTests {

    @Override

    @DataProvider(parallel = false)

    public Object[][] scenarios() {

        return super.scenarios();
    }
}