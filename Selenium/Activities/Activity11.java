package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        // Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String element = driver.getTitle();
        System.out.println("Home Page Title is " + element);


        driver.findElement(By.id("dynamicText"));
        WebElement checkbox=driver.findElement(By.name("toggled"));
        checkbox.click();
        if(checkbox.isSelected())
        {  System.out.println("Check Box is Checked ");
        }
        checkbox.click();
        System.out.println("Check Box is Checked " + checkbox.isSelected());


    }
}
