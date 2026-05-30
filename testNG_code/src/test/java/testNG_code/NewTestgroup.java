package testNG_code;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestgroup {
	WebDriver driver;

    @BeforeTest(alwaysRun=true)
    public void beforeTest() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
            "https://demowebshop.tricentis.com/"
        );
    }

    @Test(alwaysRun=true,groups="smoke")
    public void registration() {

        driver.findElement(
            By.linkText("Register")
        ).click();

        driver.findElement(
            By.id("gender-male")
        ).click();

        driver.findElement(
            By.id("FirstName")
        ).sendKeys("Akash");

        driver.findElement(
            By.id("LastName")
        ).sendKeys("Raj");

        driver.findElement(
            By.id("Email")
        ).sendKeys("aka12@gmail.com");

        driver.findElement(
            By.id("Password")
        ).sendKeys("Ar1234");

        driver.findElement(
            By.id("ConfirmPassword")
        ).sendKeys("Ar1234");

        driver.findElement(
            By.id("register-button")
        ).click();
    }

    @Test(groups = "smoke")
    public void login() {

        driver.findElement(
            By.linkText("Log in")
        ).click();

        driver.findElement(
            By.id("Email")
        ).sendKeys("akash725@gmail.com");

        driver.findElement(
            By.id("Password")
        ).sendKeys("Ar1234");

        driver.findElement(
            By.xpath("//input[@value='Log in']")
        ).click();
    }

    @Test(groups = "smoke")
    public void multiple_search() throws Exception {

        String products[] = {
            "laptop",
            "book",
            "camera"
        };

        for (String p : products) {

            WebElement search =
                driver.findElement(
                    By.id("small-searchterms")
                );

            search.clear();

            search.sendKeys(p);

            search.submit();

            Thread.sleep(2000);
        }
    }

    @Test(groups="smoke")
    public void add_to_cart()
            throws Exception {

        driver.findElement(
            By.id("small-searchterms")
        ).sendKeys("laptop");

        driver.findElement(
            By.id("small-searchterms")
        ).submit();

        driver.findElement(
            By.linkText("14.1-inch Laptop")
        ).click();

        driver.findElement(
            By.xpath(
                "//input[@value='Add to cart']"
            )
        ).click();

        Thread.sleep(2000);
    }

    @Test( groups = "regression")
    public void product_details()
            throws Exception {

        driver.findElement(
            By.xpath("(//img)[1]")
        ).click();

        Thread.sleep(2000);
    }

    @Test(groups = "regression")
    public void delete_cart_item()
            throws Exception {

        driver.findElement(
            By.linkText("Shopping cart")
        ).click();

        driver.findElement(
            By.xpath(
                "//input[contains(@name,'removefromcart')]"
            )
        ).click();

        driver.findElement(
            By.name("updatecart")
        ).click();

        Thread.sleep(2000);
    }

    @Test(groups = "regression")
    public void change_Address()
            throws Exception {

        driver.findElement(
            By.linkText("My account")
        ).click();

        driver.findElement(
            By.linkText("Addresses")
        ).click();

        Thread.sleep(2000);
    }

    @Test( groups = "regression")
    public void Change_name()
            throws Exception {

        driver.findElement(
            By.linkText("My account")
        ).click();

        WebElement fname =
            driver.findElement(
                By.id("FirstName")
            );

        fname.clear();

        fname.sendKeys(
            "Akash Singh"
        );

        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {

        driver.quit();
    }
}
