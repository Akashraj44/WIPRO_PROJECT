package utilities;

import org.openqa.selenium.WebElement;

public class ExceptionHandler {

    public static void retryClick(
            WebElement element) {

        int attempts = 0;

        while(attempts < 3) {

            try {

                element.click();

                break;
            }

            catch(Exception e) {

                attempts++;
            }
        }
    }
}