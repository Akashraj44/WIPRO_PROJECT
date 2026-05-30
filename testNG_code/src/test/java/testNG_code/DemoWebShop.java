package testNG_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShop {

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

	@Test(priority = 1)
	public void registration() {

		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys("Akash");

		driver.findElement(By.id("LastName")).sendKeys("Raj");

		driver.findElement(By.id("Email")).sendKeys("aka12@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Ar1234");

		driver.findElement(By.id("ConfirmPassword"))
		.sendKeys("Ar1234");

		driver.findElement(By.id("register-button"))
		.click();
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {

		driver.findElement(By.linkText("Log in"))
		.click();

		driver.findElement(By.id("Email"))
		.sendKeys("aka12@gmail.com");

		driver.findElement(By.id("Password"))
		.sendKeys("Ar1234");

		driver.findElement(
		By.xpath("//input[@value='Log in']"))
		.click();
		Thread.sleep(5000);
	}
	@Test(priority = 3)
	public void multiple_search()
			throws Exception {

		String products[] =
		{"laptop","book","camera"};

		for(String p : products) {

			WebElement search =
			driver.findElement(
			By.id(
			"small-searchterms"));

			search.clear();

			search.sendKeys(p);

			search.submit();

			Thread.sleep(2000);
		}
	}
	@Test(priority = 4)
	public void add_to_cart() throws InterruptedException {

		driver.findElement(
		By.id(
		"small-searchterms"))
		.sendKeys("laptop");

		driver.findElement(
		By.id(
		"small-searchterms"))
		.submit();

		driver.findElement(
		By.linkText(
		"14.1-inch Laptop"))
		.click();

		driver.findElement(
		By.xpath(
		"//input[@value='Add to cart']"))
		.click();
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void product_details() throws InterruptedException {

		driver.findElement(
		By.xpath("(//img)[1]"))
		.click();
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void delete_cart_item() throws InterruptedException {

		driver.findElement(
		By.linkText(
		"Shopping cart"))
		.click();

		driver.findElement(
		By.xpath(
		"//input[contains(@name,'removefromcart')]"))
		.click();

		driver.findElement(
		By.name(
		"updatecart"))
		.click();
		Thread.sleep(2000);
	}
	@Test(priority = 7)
	public void change_Address() throws InterruptedException {

		driver.findElement(
		By.linkText(
		"My account"))
		.click();

		driver.findElement(
		By.linkText(
		"Addresses"))
		.click();
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void Change_name() throws InterruptedException {

		driver.findElement(
		By.linkText(
		"My account"))
		.click();

		WebElement fname =
		driver.findElement(
		By.id(
		"FirstName"));

		fname.clear();

		fname.sendKeys(
		"Akash singh");
		Thread.sleep(2000);
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}
}