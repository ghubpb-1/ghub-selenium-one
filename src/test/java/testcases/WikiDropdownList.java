package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WikiDropdownList {
    //select a dropdown list from the wiki page
    public static void main(String[] args) throws IOException {
        System.out.println("WikiDropdownList.java is running in the test package");


        WebDriver driver = new FirefoxDriver();

        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(java.time.Duration.ofSeconds(10))
                .pollingEvery(java.time.Duration.ofSeconds(2))
                .ignoring(Exception.class);


        final String s = "https://wikipedia.org";
        driver.get(s);
        System.out.println("Firefox browser opened with URL: " + driver.getCurrentUrl());

        driver.findElement(By.xpath("/html/body/main/nav[2]/div[1]/button/span")).click();
        try {
            List<WebElement> links = driver.findElements(By.tagName("a"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("links.txt"));
            for (WebElement link : links) {
                String href = link.getAttribute("href");
                if (href != null) {
                    System.out.println(href); // Print the link
                    writer.write(href);
                    writer.newLine(); // Write to file
                }
            }
            // Close the BufferedWriter
            writer.close();
            System.out.println("Links have been written to links.txt & Total Links I got are " + links.size() + " links");

//            WebElement dropdown = driver.findElement(By.id("searchLanguage"));
//            Select select = new Select(dropdown);
//            select.selectByVisibleText("العربية");
//            System.out.println("WikiDropdownList.java has completed successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        WebElement block = driver.findElement(By.xpath("/html/body/footer/nav"));
        BufferedWriter writer;
        try {
            List<WebElement> links = block.findElements(By.tagName("a"));
            writer = new BufferedWriter(new FileWriter("blocklinks.txt"));
            for (WebElement link : links) {
                String href = link.getAttribute("href");
                if (href != null) {
                    System.out.println(href); // Print the link
                    writer.write(href);
                    writer.newLine(); // Write to file
                }
            }
            writer.close();
            System.out.println("Links have been written to blocklinks.txt & Total Links I got are " + links.size() + " links");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}