package fivestar.login;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	@Test
    public static void main(String[] args) throws InterruptedException { 
    	  WebDriver driver = new ChromeDriver();
          driver.get("https://dev.fivestarfans.com/live-game/game-schedule");

          driver.quit();
     //   WebDriver driver = new FirefoxDriver();
       //System.setProperty("webdriver.gecko.driver", "/home/download/geckodriver");
      // driver.get("https://fmgdevportals.hyperbig.com/login");
		//driver.manage().window().maximize();
		//driver.findElement(By.cssSelector(".nav-item:nth-child(1) > .text-center")).click();
	    driver.findElement(By.name("email")).click();
		   driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div[2]/div/div/div")).click();
		   driver.findElement(By.xpath("//input[@name=\'email\']")).sendKeys("geff@blaze.ws");
		    driver.findElement(By.name("password")).sendKeys("Gj12345!");
		  //  driver.findElement(By.cssSelector("#tab2hellowWorld .pg-icon")).click();//
		    driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[1]")).click();
		    Thread.sleep(3000);

    }
}
