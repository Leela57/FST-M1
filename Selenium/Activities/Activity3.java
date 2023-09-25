package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        String element = driver.getTitle();
        System.out.println("Home Page Title is " + element);
        driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("The display message is " + message);

        Thread.sleep(2000);
        driver.quit();

    }
}