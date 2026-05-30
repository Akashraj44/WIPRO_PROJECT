package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Tira_beauty {
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts()
					.implicitlyWait(
							Duration.ofSeconds(10));

			driver.get(
					"https://www.tirabeauty.com/");
	  }
	  @Test(priority = 1)
		public void registration() throws InterruptedException {

		  driver.findElement(
					By.xpath(
							"//*[contains(text(),'Login')]"))
					.click();

			Thread.sleep(2000);

			// Mobile number
			driver.findElement(
					By.xpath("//input"))
					.sendKeys(
							"6205371587");

			// Checkbox click using JS
			WebElement checkbox =
			driver.findElement(
			By.xpath(
			"//input[@type='checkbox']"));

			JavascriptExecutor js =
			(JavascriptExecutor) driver;

			js.executeScript(
			"arguments[0].click();",
			checkbox);

			Thread.sleep(2000);
		}

		@Test(priority = 2)
		public void login()
				throws Exception {
			driver.findElement(
					By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/svg/g/rect[1]"))
					.click();

			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div/div/div/div[2]/button"))
					.click();

			Thread.sleep(20000);
		}

		@Test(priority = 3)
		public void multiple_search()
				throws Exception {

			WebElement search =driver.findElement(By.id("search"));
			// beauty product
			search.sendKeys("beauty product");

			search.sendKeys(Keys.ENTER);

			Thread.sleep(2000);

			search =driver.findElement(By.id("search"));

			search.clear();

			// hair wax
			search.sendKeys(
			"hair wax");

			search.sendKeys(
			Keys.ENTER);

			Thread.sleep(2000);

			search =driver.findElement(By.id("search"));

			search.clear();

			// perfume
			search.sendKeys("perfume");

			search.sendKeys(
			Keys.ENTER);

			Thread.sleep(2000);
		}

		@Test(priority = 4)
		public void add_to_cart()
				throws Exception {

			driver.findElement(
			By.xpath("(//img)[1]"))
			.click();

			Thread.sleep(3000);

			for(String win :
			driver.getWindowHandles()) {

				driver.switchTo()
				.window(win);
			}

			driver.findElement(
			By.xpath(
			"//*[contains(text(),'Add to Bag')]"))
			.click();

			Thread.sleep(3000);
		}

		@Test(priority = 5)
		public void product_details()
				throws Exception {

			driver.findElement(
			By.xpath("(//img)[1]"))
			.click();

			Thread.sleep(2000);
		}

		@Test(priority = 6)
		public void delete_cart_item()
				throws Exception {

			driver.findElement(
			By.xpath(
			"//*[contains(@href,'cart')]"))
			.click();

			Thread.sleep(2000);

			driver.findElement(
			By.xpath(
			"//*[contains(text(),'Remove')]"))
			.click();
		}

		@Test(priority = 7)
		public void change_Address() {

			driver.findElement(
			By.xpath(
			"//*[contains(text(),'Change')]"))
			.click();
		}

		@Test(priority = 8)
		public void Change_name() {

			driver.findElement(
			By.xpath("//input"))
			.clear();

			driver.findElement(
			By.xpath("//input"))
			.sendKeys(
			"Akash");
		}

		@AfterTest
		public void afterTest() {

			driver.quit();
		}
	}
 
