package base;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class BaseClass {

   public WebDriver driver;
   public HomePage homePageObjects;
   //public LoginPage loginPageObjects;

    public String genrateRandomEmail(){
       String randomData = RandomStringUtils.randomAlphanumeric(7);
       return randomData;
    }
}
