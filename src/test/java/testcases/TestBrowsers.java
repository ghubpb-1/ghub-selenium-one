package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("TestBrowsers.java is running in the test package");

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        System.out.println("Firefox browser opened with URL: " + firefoxDriver.getCurrentUrl());

        // Copy title to a variable and print it
        String pageTitle = firefoxDriver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        firefoxDriver.manage().window().fullscreen();
        //Sleep for 5 seconds to observe the fullscreen mode

        Thread.sleep(5000); // 5000 milliseconds = 5 seconds


        firefoxDriver.manage().window().maximize();
        Thread.sleep(5000);


        // Close the browser
        firefoxDriver.quit();
        System.out.println("TestBrowsers.java through firefoxDriver is completed successfully");
//
//
//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://www.google.com");
//        System.out.println("Chrome browser opened with URL: " + chromeDriver.getCurrentUrl());
//        // Copy title to a variable and print it
//        String chromePageTitle = chromeDriver.getTitle();
//
//        System.out.println("Chrome page title is: " + chromePageTitle);
//        // Close the browser
//        chromeDriver.quit();
//
//        System.out.println("TestBrowsers.java through chromeDriver is completed successfully");
//
//
//        System.setProperty("webdriver.edge.driver", "D:/Prakash/msedgedriver.exe");
//        EdgeDriver edgeDriver = new EdgeDriver();
//
//        edgeDriver.get("https://www.google.com");
//        System.out.println("Edge browser opened with URL: " + edgeDriver.getCurrentUrl());
//        // Copy title to a variable and print it
//        String edgePageTitle = edgeDriver.getTitle();
//        System.out.println("Edge page title is: " + edgePageTitle);
//        // Close the browser
//        edgeDriver.quit();
//        System.out.println("TestBrowsers.java through edgeDriver is completed successfully");
//
//        System.out.println("All browsers have been tested successfully.");
//
//

    }
}