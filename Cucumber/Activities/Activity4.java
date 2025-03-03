package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity4 {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void loginPage1() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @When("^User enters username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));

        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
    }

    @And("^Close the Browser$")
    public void closeBrowser() {
        driver.close();
    }
}

