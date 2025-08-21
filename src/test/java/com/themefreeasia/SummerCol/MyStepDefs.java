package com.themefreeasia.SummerCol;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.After;
import java.util.List;
import java.util.stream.Collectors;

public class MyStepDefs {
    // This class is used to define step definitions for Cucumber tests
    FirefoxDriver driver = new FirefoxDriver();
    SoftAssert Assert = new SoftAssert();
    public String baseUrl;
    String productTitle;

    @Given("I am on the Summer Collection page {string}")
    public void i_am_on_the_summer_collection_page(String s) {
        driver.get(s);
        System.out.println("I am on the Summer Collection page" + s);
        baseUrl = s;
    }

    @Then("I should see the title {string}")
    public void i_should_see_the_title(String expectedTitle) {
        System.out.println("I should see the title: " + expectedTitle);
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Page title does not match expected title.");
        Assert.assertAll();
    }


//    driver.get(baseUrl);
//    WebElement panel = driver.findElement(By.className("summary entry-summary"));
//    panel.findElements(By.tagName("a")
//    ).forEach(element -> {
//        String productTitle = element.getText();
//        System.out.println("Product Title: " + productTitle);
//    });


//
//    {
//        String productTitle = element.getText();
//        System.out.println("Product Title: " + productTitle);
//    };


//    @Given("verify all the products are available as expected")
//    public void verify_all_the_products_are_available_as_expected() {
//        driver.get(baseUrl);
//        List<String> productTitles = new ArrayList<>();
//        for (WebElement element : links) {
//            productTitle = element.getText();
//            if (!productTitle.isEmpty()) {
//                productTitles.add(productTitle);
//                System.out.println("Product Title: " + productTitle);
//            }
//        }
//        System.out.println("Verifying all products are available as expected.");
//    }

    @And("verify all the below products are available as expected")
    public void verify_all_the_below_products_are_available_as_expected(DataTable dataTable) {
        // Get expected products from the data table
        List<String> expectedProducts = dataTable.asList().subList(1, dataTable.height()); // Skip header row

        // Find all product elements and get their text
        WebElement panel = driver.findElement(By.cssSelector(".summary.entry-summary"));
        List<WebElement> productElements = panel.findElements(By.tagName("a"));

        // Extract text from product elements and filter out empty strings
        List<String> actualProducts = productElements.stream()
                .map(WebElement::getText)
                .filter(text -> !text.isEmpty())
                .collect(Collectors.toList());

        // Verify each expected product exists in the actual products list
        for (String expectedProduct : expectedProducts) {
            boolean found = actualProducts.stream()
                    .anyMatch(actual -> actual.contains(expectedProduct));

            Assert.assertTrue(found, "Product not found: " + expectedProduct);
            System.out.println("Verified product: " + expectedProduct);
        }

        Assert.assertAll();
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Test completed successfully. Browser closed.");
    }

}
