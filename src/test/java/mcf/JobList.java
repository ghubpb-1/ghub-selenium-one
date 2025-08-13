package mcf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //Navigate to https://www.mycareersfuture.gov.sg/search?search=Test&sortBy=new_posting_date&page=0
        System.out.println("JobList.java is running in the mcf package");
        WebDriver driver = new FirefoxDriver();
        //Maximize the window
        //driver.manage().window().maximize();
        driver.get("https://www.mycareersfuture.gov.sg/search?search=Test&sortBy=new_posting_date&page=0");
        System.out.println("Navigated to MyCareersFuture job search page");
        //Wait for the page to load
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        //Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        //Find all job listings
        System.out.println("Finding all job listings...");
        WebElement totalJobs = driver.findElement(By.xpath("//*[@data-testid=\"search-results-page-label\"]"));
        System.out.println("Total jobs found: " + totalJobs.getText());
//print the 1st word from totalJobs.getText()
        String[] words1 = totalJobs.getText().split(" ");
        System.out.println("First word from total jobs text: " + words1[0]);

        
        driver.quit();


// ... your code ...
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");

    }
}
