package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    WebDriver driver;


    public AddCustomerPage(WebDriver ldriver){
        driver = ldriver;
        PageFactory.initElements(ldriver,this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement email;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement firstName;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement lastName;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement company;


    // Action Method for Add Customer Page -->>
    public String getPageTitle(){
        return driver.getTitle();
    }
    public void enterEmail(){
        email.sendKeys("ravi@gmail.com");
    }
    public void enterFirstName(){
        firstName.sendKeys("ravi@gmail.com");
    }
    public void enterLastName(){
        lastName.sendKeys("ravi@gmail.com");
    }
    public void entercompany(){
        company.sendKeys("ravi@gmail.com");
    }


}
