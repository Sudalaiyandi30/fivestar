package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class TestNG {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void loginToFiveStarApp() throws InterruptedException {
        driver.get("https://dev.fivestarfans.com/user/login");
        Thread.sleep(1000);

        // Enter email
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("sudalaiyandi@blaze.ws");

        // Enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")))
                .sendKeys("Fans@123");

        // Click Login button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Login')]"))).click();

        // Wait for redirect
        wait.until(ExpectedConditions.urlContains("game-schedule"));
        System.out.println("✅ Logged in! Current URL: " + driver.getCurrentUrl());
        driver.findElement(By.xpath("(//button[@class='chakra-tabs__tab css-16ct5qa'])[2]")).click();
        driver.findElement(By.xpath("(//button[@class='chakra-button css-1ten4br'])[1]")).click();  

        // Click Playcast menu
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'chakra-button chakra-menu__menu-button')])[1]"))).click();
        System.out.println("🎮 Playcast clicked");
        Thread.sleep(1000);
      
     
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

