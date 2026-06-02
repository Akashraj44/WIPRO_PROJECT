package PagesPOM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.WaitUtils;

public class AllPages {

    WebDriver driver;
    WaitUtils wait;

    public AllPages(WebDriver driver) {

        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    // =========================
    // POPUP
    // =========================

    By popupButton =
            By.xpath("//button[contains(text(),'I Understand & Continue')]");

    // =========================
    // LOGIN PAGE
    // =========================

    By loginEmail =
            By.name("email");

    By loginPassword =
            By.name("password");

    By loginButton =
            By.xpath("//button[@type='submit']");

    // =========================
    // REGISTRATION PAGE
    // =========================

    By firstName =
            By.name("first_name");

    By lastName =
            By.name("last_name");

    By registerEmail =
            By.name("email");

    By registerPassword =
            By.name("password");

    By signupButton =
            By.xpath("//button[@type='submit']");

    // =========================
    // HOTEL SEARCH
    // =========================
    By tour=By.xpath("/html/body/div[2]/div[4]/div/nav/button[2]");
    By destination =
            By.xpath("//input[@placeholder='Search By City']");

    By nationalityDropdown =
    		By.cssSelector(
    		".select2-selection");

    By nationalitySearch =
            By.xpath("//input[@class='select2-search__field']");

    By searchButton =
            By.xpath("/html/body/div[2]/div/div/div[1]/div/div/form/div/div[6]/button/span[1]");

    // Dynamic XPath Example

    By dynamicHotelPrice =
            By.xpath("//span[contains(@class,'price')]");

    // =========================
    // POPUP
    // =========================

    public void closePopup() {

        try {

            By popup =
            By.xpath("//button[contains(text(),'I Understand')]");

            wait.waitForClickable(popup);

            driver.findElement(popup).click();

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Popup Not Displayed");
        }
    }

    // =========================
    // LOGIN
    // =========================

    public void enterLoginEmail(String email) {

        wait.waitForVisible(loginEmail);

        driver.findElement(loginEmail)
              .sendKeys(email);
    }

    public void enterLoginPassword(String password) {

        wait.waitForVisible(loginPassword);

        driver.findElement(loginPassword)
              .sendKeys(password);
    }

    public void clickLoginButton() {

        try {

            wait.waitForClickable(loginButton);

            driver.findElement(loginButton).click();
        }

        catch(Exception e) {

            WebElement button =
            driver.findElement(loginButton);

            JavascriptExecutor js =
            (JavascriptExecutor) driver;

            js.executeScript(
            "arguments[0].click();",
            button);
        }
    }
    // =========================
    // REGISTRATION
    // =========================

    public void enterFirstName(String fname) {

        wait.waitForVisible(firstName);

        driver.findElement(firstName)
              .sendKeys(fname);
    }

    public void enterLastName(String lname) {

        wait.waitForVisible(lastName);

        driver.findElement(lastName)
              .sendKeys(lname);
    }

    public void enterRegisterEmail(String email) {

        wait.waitForVisible(registerEmail);

        driver.findElement(registerEmail)
              .sendKeys(email);
    }

    public void enterRegisterPassword(String password) {

        wait.waitForVisible(registerPassword);

        driver.findElement(registerPassword)
              .sendKeys(password);
    }

    public void clickSignupButton() {

        try {
            closePopup();
        } catch (Exception e) {
        }

        try {

            wait.waitForClickable(signupButton);

            driver.findElement(signupButton).click();

        } catch (Exception e) {

            WebElement button =
                    driver.findElement(signupButton);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    button);
        }
    }

    // =========================
    // HOTEL SEARCH
    // =========================

    public void enterDestination(String city) {
    	driver.findElement(tour).click();

        wait.waitForClickable(destination);
      //  driver.findElement(tour).click();
  

        driver.findElement(destination)
              .click();

        driver.findElement(destination)
              .sendKeys(city);

        driver.findElement(destination)
              .sendKeys(Keys.ARROW_DOWN);

        driver.findElement(destination)
              .sendKeys(Keys.ENTER);

        driver.findElement(By.tagName("body"))
              .click();
    }

    // =========================
    // NATIONALITY
    // =========================

    public void selectNationality(String country) {

        wait.waitForClickable(nationalityDropdown);

        driver.findElement(nationalityDropdown)
              .click();

        wait.waitForVisible(nationalitySearch);

        driver.findElement(nationalitySearch)
              .sendKeys(country);

        driver.findElement(nationalitySearch)
              .sendKeys(Keys.ARROW_DOWN);

        driver.findElement(nationalitySearch)
              .sendKeys(Keys.ENTER);
    }

    // =========================
    // SEARCH HOTEL
    // =========================

    public void clickSearchButton() {
    	
           //  driver.findElement(tour).clear();
       
            driver.findElement(searchButton).click();

        }

    // =========================
    // VALIDATIONS
    // =========================

    public boolean isLoginSuccessful() {

        return driver.getCurrentUrl()
                .contains("account");
    }

    public boolean isRegistrationSuccessful() {

        return driver.getPageSource()
                .contains("Account");
    }

    public boolean isHotelDisplayed() {

        return driver.getCurrentUrl()
                .contains("hotels");
    }

    // =========================
    // HOTEL PRICE VALIDATION
    // =========================

    public void validateHotelPrices() {

        List<WebElement> prices =
                driver.findElements(dynamicHotelPrice);

        List<Integer> amountList =
                new ArrayList<>();

        for (WebElement e : prices) {

            try {

                String price =
                        e.getText()
                         .replace("₹", "")
                         .replace(",", "")
                         .trim();

                amountList.add(
                        Integer.parseInt(price));
            }

            catch (Exception ex) {

                System.out.println(
                        "Invalid Price");
            }
        }

        if(amountList.size() > 0) {

            int highest =
                    Collections.max(amountList);

            int lowest =
                    Collections.min(amountList);

            double average =
                    amountList.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            System.out.println(
                    "Highest Price : "
                    + highest);

            System.out.println(
                    "Lowest Price : "
                    + lowest);

            System.out.println(
                    "Average Price : "
                    + average);
        }
    }

    // =========================
    // DUPLICATE HOTEL CHECK
    // =========================

    public void checkDuplicateHotels() {

        List<WebElement> hotels =
                driver.findElements(
                By.xpath("//h5"));

        List<String> hotelNames =
                new ArrayList<>();

        for(WebElement hotel : hotels) {

            String name =
                    hotel.getText();

            if(hotelNames.contains(name)) {

                System.out.println(
                        "Duplicate Hotel : "
                        + name);
            }

            else {

                hotelNames.add(name);
            }
        }
    }
}