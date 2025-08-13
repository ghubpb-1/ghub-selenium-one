package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWebElements {

    public static void main(String[] args) {
        System.out.println("TestWebElements.java is running in the test package");

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        System.out.println("Firefox browser opened with URL: " + firefoxDriver.getCurrentUrl());

        System.out.println("Before Maximize :" + firefoxDriver.manage().window().getSize());
        System.out.println("Before Maximize :" + firefoxDriver.manage().window().getPosition());

        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        firefoxDriver.findElement(By.id("APjFqb")).sendKeys("Selenium WebDriver" + Keys.RETURN);
        //firefoxDriver.findElement(By.id("APjFqb")).sendKeys("Selenium WebDriver"+ Keys

        //     I want to click this

//        WebElement searchButton = firefoxDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[1]/div/span/svg"));
//        searchButton.click();
        //


        System.out.println(firefoxDriver.manage().window().getSize());
        System.out.println(firefoxDriver.manage().window().getPosition());
        System.out.println("Page title is: " + firefoxDriver.getTitle());

        WebDriverWait wait = new WebDriverWait(firefoxDriver,java.time.Duration.ofSeconds(5));
        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(firefoxDriver)
                .withTimeout(java.time.Duration.ofSeconds(10))
                .pollingEvery(java.time.Duration.ofSeconds(2))
                .ignoring(Exception.class);

        firefoxDriver.manage().window().setPosition(new org.openqa.selenium.Point(100, 100));
        firefoxDriver.quit();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb"))).sendKeys("Selenium WebDriver" + Keys.RETURN);
//        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb"))).sendKeys("Selenium WebDriver" + Keys.RETURN);
        System.out.println("TestWebElements.java has completed successfully");

    }
}