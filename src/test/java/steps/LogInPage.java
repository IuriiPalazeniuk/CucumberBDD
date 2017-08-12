package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage extends DriverFactory {

    public LogInPage(WebDriver driver) {
        super(driver);
    }
    private String LogIn = "//*[@id='header_user_menu_parent']/a";
    private String mailField = "//*[@id='popup_signin']/div[1]/div[1]/input";
    private String passwordField = "//input[@name='password']";
    private String submitButton = "//button[@class='btn-link-i']";

    public void goToRozetka(){
        driver.get("https://rozetka.ua");
    }

    public void enterUserNamePassword(String arg1, String arg2){
        driver.findElement(By.xpath(LogIn)).click();
        driver.findElement(By.xpath(mailField)).sendKeys(arg1);
        driver.findElement(By.xpath(passwordField)).sendKeys(arg2);

    }

    public void pressSubmitButton(){
        driver.findElement(By.xpath(submitButton)).click();
    }

}
