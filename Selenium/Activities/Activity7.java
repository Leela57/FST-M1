package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        String element = driver.getTitle();
        System.out.println("Home Page Title is " + element);

        WebElement drop1=driver.findElement(By.id("draggable"));
        WebElement drop2=driver.findElement(By.id("droppable"));
        WebElement drop3=driver.findElement(By.id("dropzone2"));

        builder.clickAndHold(drop1).moveToElement(drop2).pause(1000).release().build().perform();
        builder.dragAndDrop(drop1,drop3).pause(1000).build().perform();
        driver.close();


    }
}
