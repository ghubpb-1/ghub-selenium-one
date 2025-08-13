package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println("Assignment1.java is running in the test package");

        // Navigate to Google.com
        System.out.println("Opening Google.com in the browser...");
        WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(org.openqa.selenium.By.name("q"));
        searchBox.sendKeys("way2automation");
        searchBox.submit();

        // Wait for the results to load and display the title

        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        //Click on the 1st result link
        System.out.println("Waiting for the results to load...");
        WebElement firstResult = driver.findElement(org.openqa.selenium.By.cssSelector("h3"));
        firstResult.click();
        // Wait for the page to load and display the title

        WebElement page= driver.findElement(By.xpath("/html/body"));
        page.findElements(By.tagName("a")).forEach(link -> {
            String href = link.getAttribute("href");
            if (href != null) {
                System.out.println("Link found: " + href);
            }
        });
        System.out.println("Assignment1.java has completed successfully");
        driver.quit();
    }

}
