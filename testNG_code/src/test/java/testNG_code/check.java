package testNG_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class check {
		WebDriver driver;

		@BeforeTest
		public void beforeTest() {

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts()
			.implicitlyWait(
			Duration.ofSeconds(10));

			driver.get(
			"https://demowebshop.tricentis.com/");
		}

		@DataProvider(
		name = "userdata")

		public Object[][] data() {

			return new Object[][] {

				{"Akash",
				"Raj",
				"akash1@test.com"},

				{"Aman",
				"Kumar",
				"aman1@test.com"},

				{"Ravi",
				"Singh",
				"ravi1@test.com"},

				{"Rahul",
				"Das",
				"rahul1@test.com"},

				{"Rohit",
				"Sharma",
				"rohit1@test.com"}
			};
		}

		@Test(
		dataProvider =
		"userdata")

		public void register_users(

		String fname,
		String lname,
		String email)

		throws Exception {

			driver.findElement(
			By.linkText(
			"Register"))
			.click();

			driver.findElement(
			By.id(
			"gender-male"))
			.click();

			driver.findElement(
			By.id(
			"FirstName"))
			.sendKeys(fname);

			driver.findElement(
			By.id(
			"LastName"))
			.sendKeys(lname);

			driver.findElement(
			By.id(
			"Email"))
			.sendKeys(email);

			driver.findElement(
			By.id(
			"Password"))
			.sendKeys(
			"Test@123");

			driver.findElement(
			By.id(
			"ConfirmPassword"))
			.sendKeys(
			"Test@123");

			driver.findElement(
			By.id(
			"register-button"))
			.click();

			Thread.sleep(2000);

			driver.navigate()
			.to(
			"https://demowebshop.tricentis.com/register");
		}

		@AfterTest
		public void afterTest() {

			driver.quit();
		}
	}