package Stepdefination;

import org.junit.Rule;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import listener.Listener_step;

@RunWith(Cucumber.class)

@CucumberOptions(

features=
"src/test/resources/features",

glue={"Stepdefination","Hooks"},
tags="@smoke",

plugin= {

"pretty","html:target/cucumber-report.html",

"json:target/cucumber.json",

"junit:target/cucumber.xml"

},

monochrome=true

)

public class TestRunner {
	@Rule
	public Listener_step listener =new Listener_step();

}
