package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class Activity7 {
    WebDriver driver;
    WebDriver wait;

    @BeforeClass(alwaysRun = true)
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        // wait = new WebDriverWait(driver, 10);
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials () {
        return new Object[][]{
                {"admin", "password"},
                // {"testuser_2", "Test@456"}
        };
    }
    @Test(dataProvider = "Authentication")
    public void testMethod(String username, String password) {
        //Statements using parameters from dataProvider
        WebElement uname = driver.findElement(By.id("username"));
        WebElement pwd = driver.findElement(By.id("password"));

        uname.sendKeys(username);
        pwd.sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String Confirmationmsg = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(Confirmationmsg, "Welcome Back, admin");
        System.out.println(Confirmationmsg);

    }
    @AfterClass(alwaysRun = true)
    public void closedriver ()
    {
        driver.close();
    }
}
