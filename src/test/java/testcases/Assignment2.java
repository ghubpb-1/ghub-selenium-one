package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Assignment2 {

    public static void main(String[] args) {
        System.out.println("Assignment2.java is running in the test package");

        // Navigate to Google.com
        System.out.println("Opening Google.com in the browser...");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");

        // Find by relative locator
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("John Doe");
        driver.findElement(By.cssSelector(".ajaxsubmit > fieldset:nth-child(5) > input:nth-child(2)")).sendKeys("Input from CSS Selector");




        // Close the browser
//        driver.quit();
    }

}
