package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class Activity9 {
    WebDriver driver;
    WebDriver wait;

    @BeforeClass
    public void Beforeclass() throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        Reporter.log("Opening Browser");
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        Thread.sleep(1200);
    }
    @BeforeMethod
    public void beforemethod()
    {
        driver.switchTo().defaultContent();
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("Confirm Alert Execution Started");
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
        Reporter.log("Confirm Alert opened");

        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Focused to alert");

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

        confirmAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }


    @Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("Simple Alert Execution Started");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened");

        Alert simplealert = driver.switchTo().alert();
        Reporter.log("Focused to alert");

        //Get text in the alert box and print it
        String alertText = simplealert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Alert!", alertText);

        simplealert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 2)
    public void promptAlertTestCase()
    {
        Reporter.log("Prompt Alert Execution Started");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened");

        Alert promptalert = driver.switchTo().alert();
        Reporter.log("Focused to alert");

        //Get text in the alert box and print it
        String alertText = promptalert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);

        promptalert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }




    @AfterTest(alwaysRun = true)
    public void closedriver() {
        driver.close();
    }
}
