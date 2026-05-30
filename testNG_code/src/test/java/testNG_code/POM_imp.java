package testNG_code;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_imp {
	WebDriver driver;

	public POM_imp(WebDriver driver) {
		this.driver = driver;
	}

	By login = By.linkText("Log in");
	By email = By.id("Email");
	By pass = By.id("Password");
	By loginBtn =By.xpath("//input[@value='Log in']");
	By registerLink = By.linkText("Register");
	By gender = By.id("gender-male");
	By fname = By.id("FirstName");
	By lname = By.id("LastName");
	//By email = By.id("Email");
	By password = By.id("Password");
	By confirm = By.id("ConfirmPassword");
	By registerBtn = By.id("register-button");
	

	public void login() {

		driver.findElement(login).click();

		driver.findElement(email)
		.sendKeys("aka12@gmail.com");

		driver.findElement(pass)
		.sendKeys("Ar1234");

		driver.findElement(loginBtn)
		.click();
		
	}
	public void register() {

		driver.findElement(registerLink).click();

		driver.findElement(gender).click();

		driver.findElement(fname)
		.sendKeys("Akash");

		driver.findElement(lname)
		.sendKeys("Raj");

		driver.findElement(email)
		.sendKeys("aka12@gmail.com");

		driver.findElement(password)
		.sendKeys("Ar1234");

		driver.findElement(confirm)
		.sendKeys("Ar1234");

		driver.findElement(registerBtn)
		.click();
	}

  @Test
  public void f() {
  }
}
