package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2
{
    WebDriver driver;

    @BeforeClass
    public void beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");

    }

    @Test
    public void getTitle()
    {
        String title= driver.getTitle();
        System.out.println("Current Page Title is " + title);
        Assert.assertEquals(title ,"Target Practice");
    }

    @Test
    public void findblackbutton()
    {
        WebElement blckbutton= driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blckbutton.isDisplayed());
        Assert.assertEquals(blckbutton.getText(), "black");

    }

    @Test(enabled = false)
    public void skiptest()
    {
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }



    @Test
    public void skipexep()
    {
        throw new SkipException("Skipping test case");
    }


    @AfterClass
    public void closedriver()
    {
        driver.close();
    }

}


