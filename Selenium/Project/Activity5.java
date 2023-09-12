package Project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity5 {

    @Test
    public void activity4TestCase() throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='firstLevelMenu']/b)[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Edit']")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Jack New");
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Jill New");
        driver.findElement(By.id("personal_optGender_1")).click();
        WebElement dob = driver.findElement(By.id("personal_DOB"));
        dob.clear();
        dob.sendKeys("2000-10-01");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        driver.close();
    }

}
