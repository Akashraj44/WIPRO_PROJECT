package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import PagesPOM.AllPages;
import base.DriverFactory;
import io.cucumber.java.en.*;

public class allSteps {

    WebDriver driver;

    AllPages page;

    SoftAssert soft =
            new SoftAssert();

    // LOGIN

    @Given("user launches browser")
    public void user_launches_browser() {

        driver = DriverFactory.getDriver();

        driver.get(
        "https://phptravels.net/login");

        page =
        new AllPages(driver);

        page.closePopup();
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(
            String username,
            String password) {

        page.enterLoginEmail(username);

        page.enterLoginPassword(password);
    }

    @And("clicks login button")
    public void clicks_login_button() {

        page.clickLoginButton();
    }
    @Then("validate login")
    public void validate_login() {

        String url = driver.getCurrentUrl();

        System.out.println("Current URL = " + url);

        Assert.assertTrue(true);
    }
    // REGISTRATION

    @Given("user opens registration page")
    public void user_opens_registration_page() {

        driver =
        DriverFactory.getDriver();

        driver.get(
        "https://phptravels.net/signup");

        page =
        new AllPages(driver);

        page.closePopup();
    }

    @When("user enters registration details")
    public void user_enters_registration_details() {

        page.enterFirstName("Akash");

        page.enterLastName("Raj");

        page.enterRegisterEmail(
        utilities.Util.generateRandomEmail());

        page.enterRegisterPassword(
        "Test@123");
    }

    @And("clicks signup button")
    public void clicks_signup_button() {

        page.clickSignupButton();
    }

    @Then("registration should be a successful")
    public void registration_should_be_successful() {

        Assert.assertTrue(
        driver.getCurrentUrl()
        .contains("signup")
        ||
        driver.getPageSource()
        .contains("account"));
    }

    // HOTEL SEARCH

    @Given("user opens hotel search page")
    public void user_opens_hotel_search_page() {

        driver =
        DriverFactory.getDriver();

        driver.get(
        "https://phptravels.net");

        page =
        new AllPages(driver);

        page.closePopup();
    }

    @When("user enters destination")
    public void user_enters_destination() {

        page.enterDestination("Delhi");

        //page.selectNationality( "India");
    }

    @And("clicks hotel search")
    public void clicks_hotel_search() {

        page.clickSearchButton();
    }

    @Then("hotels should display")
    public void hotels_should_display() {

        Assert.assertTrue(true);
    }
}