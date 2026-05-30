package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTest{

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	String parentWindow;
	WebElement firstProduct;

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		js = (JavascriptExecutor) driver;

		driver.get("https://www.flipkart.com/");

		System.out.println("Browser opened successfully");
	}

	@Test(priority = 1)
	public void registration() {

		System.out.println(
				"Registration is not directly possible because Flipkart requires mobile OTP verification.");
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[5]/div/div/div/div[2]/div/form/div[1]/input")))
				.sendKeys("7257877412");

		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[contains(text(),'Request OTP')]")))
				.click();

		System.out.println("OTP sent successfully");

		Thread.sleep(10000);

		System.out.println("OTP requested successfully. Enter OTP manually.");
	}

	@Test(priority = 3)
	public void change_name() throws InterruptedException {

		Thread.sleep(15000);

		try {

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//span[contains(text(),'Account') or contains(text(),'Login')]")))
					.click();

			Thread.sleep(2000);

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[contains(text(),'My Profile') or contains(text(),'Profile')]")))
					.click();

			Thread.sleep(3000);

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//span[text()='Edit']")))
					.click();

			Thread.sleep(2000);

			WebElement firstName = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.xpath("(//input[@type='text'])[1]")));

			firstName.clear();

			firstName.sendKeys("Akash raj");

			WebElement lastName = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.xpath("(//input[@type='text'])[2]")));

			lastName.clear();

			lastName.sendKeys("Kumar");

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//button[contains(text(),'SAVE') or contains(text(),'Save')]")))
					.click();

			System.out.println("Name changed successfully");

		}

		catch (Exception e) {

			System.out.println("Change name failed : " + e);
		}
	}

	@Test(priority = 4)
	public void change_address() {

		try {

			driver.get("https://www.flipkart.com/account/addresses");

			Thread.sleep(2000);

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[contains(text(),'ADD A NEW ADDRESS')]")))
					.click();

			WebElement name = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.name("name")));

			name.clear();

			name.sendKeys("Akash singh");

			WebElement mobile = driver.findElement(
					By.name("phone"));

			mobile.clear();

			mobile.sendKeys("9939045712");

			WebElement pincode = driver.findElement(
					By.name("pincode"));

			pincode.clear();

			pincode.sendKeys("834001");

			WebElement locality = driver.findElement(
					By.name("addressLine2"));

			locality.clear();

			locality.sendKeys("Ranchi");

			WebElement address = driver.findElement(
					By.name("addressLine1"));

			address.clear();

			address.sendKeys("Ranchi jharkhand");

			WebElement city = driver.findElement(
					By.name("city"));

			city.clear();

			city.sendKeys("Ranchi");

			Thread.sleep(2000);

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//span[contains(text(),'Home')]")))
					.click();

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//button[contains(text(),'Save')]")))
					.click();

			System.out.println("Address added successfully");

		}

		catch (Exception e) {

			System.out.println("Address failed : " + e);
		}
	}

	@Test(priority = 5)
	public void multiple_search() {

		try {

			String products[] = { "Laptop", "Watch", "Mobile" };

			for (String item : products) {

				WebElement searchBox = wait.until(
						ExpectedConditions.visibilityOfElementLocated(
								By.name("q")));

				js.executeScript("window.scrollTo(0,0)");

				Thread.sleep(2000);

				searchBox.click();

				searchBox.sendKeys(Keys.CONTROL + "a");

				searchBox.sendKeys(Keys.DELETE);

				Thread.sleep(1000);

				searchBox.sendKeys(item);

				searchBox.sendKeys(Keys.ENTER);

				System.out.println(item + " searched successfully");

				Thread.sleep(4000);
			}

		}

		catch (Exception e) {

			System.out.println("Multiple search failed : " + e);
		}
	}

	@Test(priority = 6)
	public void product_details() {

		try {

			WebElement searchBox = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.name("q")));

			searchBox.sendKeys(Keys.CONTROL + "a");

			searchBox.sendKeys(Keys.DELETE);

			searchBox.sendKeys("Shoes");

			searchBox.sendKeys(Keys.ENTER);

			Thread.sleep(5000);

			firstProduct = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.xpath("(//a[contains(@href,'/p/')])[1]")));

			System.out.println("Product Name : " + firstProduct.getText());

			WebElement price = wait.until(
					ExpectedConditions.visibilityOfElementLocated(
							By.xpath("(//div[contains(text(),'₹')])[1]")));

			System.out.println("Price : " + price.getText());

		}

		catch (Exception e) {

			System.out.println("Product details failed : " + e);
		}
	}

	@Test(priority = 7)
	public void add_to_cart() throws InterruptedException {
		Thread.sleep(5000);

		try {

			String products[] = {"Shoes", "Watch", "Laptop"};

			for(String item : products) {

				driver.get("https://www.flipkart.com/");

				WebElement searchBox = wait.until(
						ExpectedConditions.visibilityOfElementLocated(
								By.name("q")));

				searchBox.sendKeys(Keys.CONTROL + "a");

				searchBox.sendKeys(Keys.DELETE);

				searchBox.sendKeys(item);

				searchBox.sendKeys(Keys.ENTER);

				Thread.sleep(5000);

				WebElement product = wait.until(
						ExpectedConditions.elementToBeClickable(
								By.xpath("(//a[contains(@href,'/p/')])[1]")));

				js.executeScript(
						"arguments[0].click();",
						product);

				Thread.sleep(5000);

				Set<String> windows = driver.getWindowHandles();

				for(String win : windows) {

					driver.switchTo().window(win);
				}

				try {

					WebElement size = wait.until(
							ExpectedConditions.elementToBeClickable(
									By.xpath("(//a[contains(@class,'CDlOaO')])[1]")));

					size.click();

					Thread.sleep(2000);

				}

				catch(Exception e) {

					System.out.println("No size option");
				}

				WebElement addCart = wait.until(
						ExpectedConditions.elementToBeClickable(
								By.xpath("//button[contains(text(),'ADD TO CART')]")));

				js.executeScript(
						"arguments[0].click();",
						addCart);

				System.out.println(item + " added to cart");

				Thread.sleep(4000);

				driver.close();

				for(String win : driver.getWindowHandles()) {

					driver.switchTo().window(win);

					break;
				}
			}

		}

		catch(Exception e) {

			System.out.println("Cart failed : " + e);
		}
	}
	@Test(priority = 8)
	public void delete_cart_item() {

		try {

			WebElement remove = wait.until(
					ExpectedConditions.elementToBeClickable(
							By.xpath("//div[contains(text(),'Remove')]")));

			remove.click();

			Thread.sleep(2000);

			WebElement confirm = wait.until(
					ExpectedConditions.elementToBeClickable(
							By.xpath("//div[contains(text(),'Remove')]")));

			confirm.click();

			System.out.println("Product removed from cart");

			Thread.sleep(3000);

		}

		catch (Exception e) {

			System.out.println("Delete cart failed : " + e);
		}
	}

	@AfterTest
	public void afterTest() {

		driver.quit();

		System.out.println("Browser closed successfully");
	}
}
