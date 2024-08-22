package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;


    public HomePage(WebDriver ldriver){
        driver = ldriver;
        PageFactory.initElements(ldriver,this);
    }

    @FindBy(xpath = "//div[@class='title']")
    public WebElement loginPage;

    @FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
    public WebElement homePageAfterLogin;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='nav-icon far fa-user']/..//i[@class='right fas fa-angle-left ']")
    public WebElement customersDropDown;

    @FindBy(xpath = "//ul[@class='nav nav-treeview']//a[@href='/Admin/Customer/List']")
    public WebElement customersButton;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement addButton;


}
