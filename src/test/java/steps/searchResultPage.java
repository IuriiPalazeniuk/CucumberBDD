package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class searchResultPage extends DriverFactory {
    public searchResultPage(WebDriver driver) {
        super(driver);
    }
    private String firstLink = "//div [@class='g-i-tile-i-title clearfix']/a";
    private String addToCart = ".//*[@id='detail_buy_label']/div[5]/div[1]/div/form/span/span/button";
    private String isAdd = "//h2[@class='cart-title']";
    private String removePhone = "//img [@class='cart-check-icon sprite']";
    private String confirmRemove = "//a[@name='delete']";

    public void clickFirstLink(){
        driver.findElement(By.xpath(firstLink)).click();
    }
    public void addProductToCart(){
        driver.findElement(By.xpath(addToCart)).click();
    }

    public boolean isElementPresent() {
        if (driver.findElements(By.xpath(isAdd)).size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void removePhone(){
        driver.findElement(By.xpath(removePhone)).click();
        driver.findElement(By.xpath(confirmRemove)).click();
    }

}
