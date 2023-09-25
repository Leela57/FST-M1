package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        String element = driver.getTitle();
        System.out.println("Home Page Title is " + element);
        Actions builder = new Actions(driver);

        //Left click
        builder.click().pause(1000).build().perform();
        String text = driver.findElement(By.className("active")).getText();
        System.out.println(text);
        builder.doubleClick().pause(1000).click().perform();
        String text2=driver.findElement(By.className("active")).getText();
        System.out.println(text2);
        builder.contextClick().pause(1000).click().perform();
        String text3=driver.findElement(By.className("active")).getText();
        driver.close();
    }
}
