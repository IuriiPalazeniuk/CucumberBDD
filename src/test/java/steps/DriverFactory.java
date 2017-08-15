package steps;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverFactory {

    WebDriver driver;

    public DriverFactory(WebDriver driver){
        this.driver = driver;
    }

}
