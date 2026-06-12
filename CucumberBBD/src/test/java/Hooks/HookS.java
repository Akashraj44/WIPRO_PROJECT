package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookS {

public static WebDriver driver;

@Before("@smoke")
public void setup() {

driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage()
.timeouts()
.implicitlyWait(
Duration.ofSeconds(10));

driver.get(
"https://tutorialsninja.com/demo/");

System.out.println(
"Browser Opened");
}

@After("@smoke")
public void tearDown() {

driver.quit();

System.out.println(
"Browser Closed");
}
}