package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class USE {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts();
		//implicitlyWait(Duration.ofSeconds(10));

		driver.get(
		"https://demowebshop.tricentis.com/");
	}
	@Test
	public void login() {
		POM_imp p=new POM_imp(driver);
		p.register();
		p.login();
	}
  @AfterTest
  public void afterTest() {
  }

}
