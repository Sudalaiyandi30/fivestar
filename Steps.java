package stepdefinition;

import io.cucumber.java.en.*;
         

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Steps {
    WebDriver driver;

    @Given("User is on the homepage")
    public void user_is_on_homepage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fivestarfans.com");
    }
    

}
