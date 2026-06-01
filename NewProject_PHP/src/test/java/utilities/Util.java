package utilities;

import java.util.Random;

public class Util {

    public static String generateRandomEmail() {

        Random random = new Random();

        int number = random.nextInt(10000);

        return "akash" + number + "@gmail.com";
    }
}