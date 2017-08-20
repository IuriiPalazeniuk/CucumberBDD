package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class MySteps {
    WebDriver driver;

   @Before
    public void beforeScenario(){
       ChromeDriverManager.getInstance().setup();
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

    @Given("^I am on the page$")
    public void iAmOnThePage(){
        new LogInPage(driver).goToRozetka();
    }

    @And("^I enter username as \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_username_as_and_password(String arg1, String arg2){
        new LogInPage(driver).enterUserNamePassword(arg1,arg2);
    }

    @And("^I press submit button$")
    public void i_press_submit_button(){
        new LogInPage(driver).pressSubmitButton();
    }

    @When("^I write to the search field \"([^\"]*)\"$")
    public void i_write_to_the_search_field(String arg1){
        new MainPage(driver).searchProdact(arg1);
    }

    @And("^I click on first link$")
    public void i_click_on_first_link(){
        new searchResultPage(driver).clickFirstLink();
    }

    @And("^I add phone to the cart$")
    public void i_add_phone_to_the_cart(){
        new searchResultPage(driver).addProductToCart();
    }

    @Then("^I check inscription added phone$")
    public void i_check_inscription_added_phone(){
        Assert.assertTrue(new searchResultPage(driver).isElementPresent());
    }
    @And("^I remove phone from the cart$")
    public void iRemovePhoneFromTheCart(){
        new searchResultPage(driver).removePhone();
    }

    @After
    public void afterScenario(){
        driver.close();
    }

}
