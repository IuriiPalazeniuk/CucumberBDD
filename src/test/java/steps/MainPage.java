package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends DriverFactory{

    public MainPage(WebDriver driver) {
        super(driver);
    }
    private String searchField = "//input [@class='rz-header-search-input-text passive']";
    private String search = "//button[@class='btn-link-i']";
    private String popUpWindow = ".//*[@id='social_popup']/div/div/a";

    public void searchProdact(String arg1){
        driver.findElement(By.xpath(searchField)).sendKeys(arg1);
        driver.findElement(By.xpath(popUpWindow)).click();
        driver.findElement(By.xpath(search)).click();
        System.out.println("Search products");
    }
}
