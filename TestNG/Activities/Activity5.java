package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5
{
    WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void Beforeclass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");

    }

    @Test (groups = {"Headertest", "Buttontest"})
    public void getPageTitle()
    {
        String title = driver.getTitle();
        System.out.println("The Page title is " +title);
        Assert.assertEquals(title,"Target Practice");
    }

    @Test (dependsOnMethods = {"getPageTitle"}, groups = {"Headertest"})
    public void Headertest1()
    {
        String thirdheader = driver.findElement(By.cssSelector("h3#third-header")).getText();
        System.out.println("The 3rd header name is " + thirdheader);
        Assert.assertEquals(thirdheader,"Third header");
    }

    @Test (dependsOnMethods = {"getPageTitle"} ,groups = "Headertest")
    public void Headertest2()
    {
        WebElement fifthcolour = driver.findElement(By.className("green"));
        Assert.assertEquals(fifthcolour.getCssValue("color"),"rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"getPageTitle"} ,groups = "Buttontest")
    public void Buttontest1()
    {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(),"Olive");
    }


    @Test (dependsOnMethods = {"getPageTitle"} ,groups = "Buttontest")
    public void Buttontest2()
    {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("colour"),"rgb(255, 255, 255)");


    }

    @AfterTest (alwaysRun = true)
    public void closedriver()
    {
        driver.close();
    }

}




