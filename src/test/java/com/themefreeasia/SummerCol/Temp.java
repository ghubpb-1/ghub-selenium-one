package com.themefreeasia.SummerCol;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static void main(String[] args) {
        // This class is used to define step definitions for Cucumber tests
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://demo.themefreesia.com/shoppingcart-plus/product/summer-collection/");
        String productTitle;

        // Use CSS selector for multiple classes
        WebElement panel = driver.findElement(By.cssSelector(".summary.entry-summary"));
        List<WebElement> links = panel.findElements(By.tagName("a"));

        List<String> productTitles = new ArrayList<>();
        for (WebElement element : links) {
            productTitle = element.getText();
            if (!productTitle.isEmpty()) {
                productTitles.add(productTitle);
                System.out.println("Product Title: " + productTitle);
            }
        }

        List<String> expectedTitles = new ArrayList<>();
        expectedTitles.add("Latex Rubber Lingerie");
        expectedTitles.add("Golden party Purse");
        expectedTitles.add("Stone Bracelet");
        expectedTitles.add("High Rise Shorts");

// Verify all the products are available as expected
        System.out.println("Verifying all products are available as expected...");
        for (String expectedTitle : expectedTitles) {
            boolean found = false;
            for (String title : productTitles) {
                if (title.contains(expectedTitle)) {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("Product title '" + expectedTitle + "' not found in the list.", found);
        }

        driver.quit();
    }

}
