package Stepdefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import pom.POM_IMP;
import Hooks.HookS;

public class Allstep {
	WebDriver driver =HookS.driver;
	POM_IMP p=new POM_IMP();
@Given("browser opens")
public void browser_opens() {

System.out.println("Browser already opened by hooks");
}

@When("user clicks My Account menu")
public void user_clicks_my_account_menu()
throws InterruptedException {

Thread.sleep(3000);

WebElement account =driver.findElement(By.xpath("//span[text()='My Account']"));

driver.navigate().refresh();

Thread.sleep(2000);

account =driver.findElement(By.xpath("//span[text()='My Account']"));

account.click();
}

@And("user clicks Register option")
public void user_clicks_register_option() {

driver.findElement(By.linkText("Register")).click();
}

@And("user enters first name (.*)$")
public void user_enters_first_name(String firstname) {

	p.enterFirstname(firstname);
System.out.println("Firstname = "+firstname);
}

@And("user enters last name (.*)$")
public void user_enters_last_name(
String lastname) {

	p.enterLastname(lastname);

}

@And("user enters email (.*)$")
public void user_enters_email(
String email) {


p.enterEmail(
email);
}

@And("user enters phone number (.*)$")
public void user_enters_phone_number(
String phone) {

p.enterPhone(phone);
}

@And("user enters password (.*)$")
public void user_enters_password(
String password) {

p.enterPassword(password);
}

@And("user confirms password (.*)$")
public void user_confirms_password(
String cpassword) {

p.confirmPassword(cpassword);
}

@And("user accepts privacy policy")
public void user_accepts_privacy_policy() {

	p.acceptPolicy();
}

@And("user clicks continue button")
public void user_clicks_continue_button()
throws InterruptedException {

	p.clickContinue();

Thread.sleep(3000);
}

@And("user clicks My Account again")
public void user_clicks_my_account_again()
throws InterruptedException {

	Thread.sleep(3000);
	/* logout after registration */

	driver.findElement(
	By.xpath("//span[text()='My Account']"))
	.click();

	Thread.sleep(1000);

	driver.findElement(
	By.linkText("Logout"))
	.click();

	Thread.sleep(2000);

	driver.findElement(
	By.linkText("Continue"))
	.click();

	System.out.println(
	"Registration logout done");

	WebElement account =
	driver.findElement(
	By.xpath("//span[text()='My Account']"));

	driver.navigate().refresh();

	Thread.sleep(2000);

	account =
	driver.findElement(
	By.xpath("//span[text()='My Account']"));

	account.click();
	
}

@And("user clicks Login option")
public void user_clicks_login_option() {

driver.findElement(
By.linkText("Login"))
.click();
}

@And("user enters login email (.*)$")
public void user_enters_login_email(
String email) {

	p.loginEmail(email);;

System.out.println(
"Email = "+email);
}

@And("user enters login password (.*)$")
public void user_enters_login_password(
String password) {

p.loginPassword(password);

System.out.println(
"Password = "+password);
}

@And("user clicks login button")
public void user_clicks_login_button() {

p.clickLogin();

String actual =
driver.findElement(
By.xpath("//h2[text()='My Account']"))
.getText();

assertEquals(
"My Account",
actual);

System.out.println(
"Assertion Passed");
}

@And("user clicks search field")
public void user_clicks_search_field() {

driver.findElement(
By.name("search"))
.click();
}

@And("user enters product name (.*)$")
public void user_enters_product_name(
String product) {

driver.findElement(
By.name("search"))
.sendKeys(product);

System.out.println(
"Product = "+product);
}

@And("user clicks search button")
public void user_clicks_search_button() {

driver.findElement(
By.xpath(
"//button[@class='btn btn-default btn-lg']"))
.click();
}

@And("user clicks add to cart button")
public void user_clicks_add_to_cart_button()
throws InterruptedException {

Thread.sleep(2000);

driver.findElement(
By.xpath("//span[text()='Add to Cart']"))
.click();
}

@Then("product added successfully")
public void product_added_successfully() {

System.out.println(
"Register Login Search AddCart Done");
}

@And("user checkout product")
public void user_checkout_product()
throws InterruptedException {

Thread.sleep(3000);

driver.findElement(
By.id("cart-total"))
.click();

Thread.sleep(2000);

driver.findElement(
By.linkText("Shopping Cart"))
.click();

Thread.sleep(2000);

driver.findElement(
By.linkText("Checkout"))
.click();

System.out.println(
"Checkout Successful");
}
@And("user remove product")
public void user_remove_product() {

driver.findElement(
By.xpath(
"//button[@data-original-title='Remove']"))
.click();

System.out.println(
"Product Removed");
}

@And("user logout account")
public void user_logout_account()
throws InterruptedException {

	Thread.sleep(3000);

	WebElement account =
	driver.findElement(
	By.xpath("//span[text()='My Account']"));

	driver.navigate().refresh();

	Thread.sleep(2000);

	account =
	driver.findElement(
	By.xpath("//span[text()='My Account']"));

	account.click();

driver.findElement(
By.linkText("Logout"))
.click();

System.out.println(
"Logout Successful");
}

@Then("process completed successfully")
public void process_completed_successfully() {

System.out.println(
"Process Completed");

//driver.quit();
}
}