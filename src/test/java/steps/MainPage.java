package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends DriverFactory{

    public MainPage(WebDriver driver) {
        super(driver);
    }
    private String searchField = "//input [@class='rz-header-search-input-text passive']";
    private String search = "//button[@class='btn-link-i']";
    private String popUpWindow1 = ".//*[@id='social_popup']/div/div/a";
    private String popUpWindow2 = "//span [@class='exponea-close-cross']";

    public void searchProdact(String arg1){
        driver.findElement(By.xpath(searchField)).sendKeys(arg1);
        driver.findElement(By.xpath(popUpWindow2)).click();
        driver.findElement(By.xpath(popUpWindow1)).click();
        driver.findElement(By.xpath(search)).click();
    }
}
