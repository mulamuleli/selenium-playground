package demoblaze_controllers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class BaseTest {

    public static WebDriver driver;

    @BeforeTest
    public void setBaseURL() {
        FirefoxOptions capabilities = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
    }

   /* @AfterTest
    public void endSession() {
        driver.quit();
    }*/


}
