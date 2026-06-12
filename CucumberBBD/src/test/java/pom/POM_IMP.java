package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Hooks.HookS;

public class POM_IMP {

WebDriver driver=HookS.driver;

/* Register Locators */

By firstname=By.id("input-firstname");

By lastname=By.id("input-lastname");

By email=By.id("input-email");

By phone=By.id("input-telephone");

By password=By.id("input-password");

By confirm=By.id("input-confirm");

By policy=By.name("agree");

By cont=By.xpath("//input[@value='Continue']");

/* Login Locator */

By login=By.xpath("//input[@value='Login']");


/* Register Methods */

public void enterFirstname(String fname){

driver.findElement(firstname)
.sendKeys(fname);

}

public void enterLastname(String lname){

driver.findElement(lastname)
.sendKeys(lname);

}

public void enterEmail(String mail){

driver.findElement(email)
.sendKeys(mail);

}

public void enterPhone(String ph){

driver.findElement(phone)
.sendKeys(ph);

}

public void enterPassword(String pass){

driver.findElement(password)
.sendKeys(pass);

}

public void confirmPassword(String cpass){

driver.findElement(confirm)
.sendKeys(cpass);

}

public void acceptPolicy(){

driver.findElement(policy)
.click();

}

public void clickContinue(){

driver.findElement(cont)
.click();

}


/* Login Methods */

public void loginEmail(String mail){

driver.findElement(email)
.sendKeys(mail);

}

public void loginPassword(String pass){

driver.findElement(password)
.sendKeys(pass);

}

public void clickLogin(){

driver.findElement(login)
.click();

}

}