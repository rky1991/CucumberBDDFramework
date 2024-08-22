package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddCustomerPage;
import pages.HomePage;

public class StepDef extends BaseClass {
    public WebDriver driver;
    public HomePage homePageObjects;
    public AddCustomerPage addCustomerPage;


    // Declaring/giving memory to objects for diff pages at time of browser launch
    @Given("I launch my crome Browser")
    public void i_launch_my_crome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.crome.driver","./driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        homePageObjects = new HomePage(driver);
        addCustomerPage = new AddCustomerPage(driver);
    }
    @When("I open URL of application {string}")
    public void i_open_orange_hrm_url(String url) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.get(url);
        Thread.sleep(500);

    }
    @Then("I verify homepage of HRM")
    public void i_verify_homepage_of_hrm() {
        // Write code here that turns the phrase above into concrete actions
        //boolean status = driver.findElement(By.xpath("//*[@class='orangehrm-login-branding']")).isDisplayed();
        //boolean status = driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).isDisplayed();
        boolean status=homePageObjects.loginPage.isDisplayed();
        Assert.assertEquals(true,status);
    }
    @Then("Close the Browser.")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

    @Then("I enter email address {string}")
    public void i_enter_email_address(String email) {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.email.clear();
        homePageObjects.email.sendKeys(email);

    }
    @Then("I enter password {string}")
    public void i_enter_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.password.clear();
        homePageObjects.password.sendKeys(password);

    }
    @Then("I click on login button.")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.loginButton.click();

    }
    @Then("I verify homepage after login.")
    public void i_verify_homepage_after_login() {
        // Write code here that turns the phrase above into concrete actions
        boolean status= homePageObjects.homePageAfterLogin.isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("I click on customers Dropdown")
    public void i_click_on_customers_dropdown() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.customersDropDown.click();
        Thread.sleep(500);
    }
    @Then("I click on customers option from list")
    public void i_click_on_customers_option_from_list() {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.customersButton.click();
    }
    @Then("I click on add button from customer page")
    public void i_click_on_add_button_from_customer_page() {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.addButton.click();

    }

    @Then("I Enter Customer info to add new customer")
    public void enter_customer_info() {
        // Write code here that turns the phrase above into concrete actions
        homePageObjects.addButton.click();
    }
    // Add New Customer Page Methods

    @Then("User can view add new customer page")
    public void getTitleOfPage() {
        // Write code here that turns the phrase above into concrete actions
        String title =addCustomerPage.getPageTitle();
        System.out.println(title);
    }


}
