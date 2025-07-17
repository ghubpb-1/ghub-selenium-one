package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {

    public static void main(String[] args) {
        System.out.println("TestBrowsers.java is running in the test package");

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        System.out.println("Firefox browser opened with URL: " + firefoxDriver.getCurrentUrl());

        // Copy title to a variable and print it
        String pageTitle = firefoxDriver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        // Close the browser
        firefoxDriver.quit();
    }
}