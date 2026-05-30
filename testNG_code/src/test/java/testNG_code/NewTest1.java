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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	WebDriver driver;
	 WebDriverWait wait ;
	  JavascriptExecutor js;
	 @BeforeTest
	  public void beforeTest() {
		 driver = new ChromeDriver();
		 
	      driver.manage().window().maximize();
	     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	   //  wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	      driver.get("https://testautomationpractice.blogspot.com/");
	      JavascriptExecutor js=(JavascriptExecutor)driver;

	
	  }
	
  @Test
  public void unita() {
	  WebElement fname=driver.findElement(By.id("firstName"));
      fname.sendKeys("Neeva");

       WebElement Iname=driver.findElement(By.id("lastName"));
       Iname.sendKeys("sharma");
       WebElement Ename=driver.findElement(By.id("userEmail"));
       Ename.sendKeys("neeva12@gmail.com");
       driver.findElement(By.id("gender-radio-1")).click();
       WebElement Mname=driver.findElement(By.id("userNumber"));
       Mname.sendKeys("6789548699");
      
		js.executeScript("window.scrollBy(0,900)");
      
    
	  
  }
  @Test
  public void unitb() {
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/select/option[103]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/select/option[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]")).click();
       WebElement sub=driver.findElement(By.id("subjectsInput"));
       sub.click();
       sub.sendKeys("com");
       sub.sendKeys(Keys.ARROW_DOWN);
       sub.sendKeys(Keys.ENTER);
       sub.sendKeys("eco");
       sub.sendKeys(Keys.ENTER);
       driver.findElement(By.id("hobbies-checkbox-1")).click();
       driver.findElement(By.id("hobbies-checkbox-2")).click();
       WebElement img=driver.findElement(By.id("uploadPicture"));
      // img.click();
       img.sendKeys("C:\\Users\\Akash raj\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-04-07 214916.png");
       WebElement add=driver.findElement(By.id("currentAddress"));
       add.sendKeys("ABC delhi");
	  
  }


  @AfterTest
  public void afterTest() {
	
  }

}
