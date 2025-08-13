package WorkDay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyInfo {


    public static void main(String[] args) {
       // Navigate to "https://rhb.wd102.myworkdayjobs.com/en-US/RHBExternalCareerSite/job/Singapore/Strategic-Planning-Executive_JR002072/apply/autofillWithResume?locationCountry=80938777cac5440fab50d729f9634969&jobFamilyGroup=dcd0863fd507101ae671d5c30bd80000&jobFamilyGroup=dcd0863fd507101ae671c45f7a330000"
       //         and select //*[@id="promptOption-dba6eb7c-0962-4fac-af73-0011b2feb441"]
        System.out.println("MyInfo.java is running in the WorkDay package");
        System.setProperty("webdriver.gecko.driver", "D:\\Prakash\\geckodriver-v0.36.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rhb.wd102.myworkdayjobs.com/en-US/RHBExternalCareerSite/job/Singapore/Strategic-Planning-Executive_JR002072/apply/autofillWithResume?locationCountry=80938777cac5440fab50d729f9634969&jobFamilyGroup=dcd0863fd507101ae671d5c30bd80000&jobFamilyGroup=dcd0863fd507101ae671c45f7a330000");
        System.out.println("Navigated to WorkDay MyInfo page");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        // Select the option
        WebElement option1 = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"promptOption-dba6eb7c-0962-4fac-af73-0011b2feb441\"]"));
        option1.click();
        //Select //*[@id="promptOption-0fd863a1-136a-4f2e-aa6b-78fca85a1750"]
        WebElement option2 = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"promptOption-d4446b3a-43bb-447a-953b-002fd21c630f\"]"));
        option2.click();
        // select //*[@id="promptOption-e2a1f710-4d91-4c0c-ba55-f20d1b54af09"]
        WebElement option3 = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"promptOption-e2a1f710-4d91-4c0c-ba55-f20d1b54af09\"]"));
        option3.click();

        //Select country = Singapore at //*[@id="country--country"]
        WebElement countryField = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"country--country\"]"));
        countryField.sendKeys("Singapore");

        // Enter 401 Bedo North Ave 3 at //*[@id="address--addressLine1"]
        WebElement addressField = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"address--addressLine1\"]"));
        addressField.sendKeys("401 Bedo North Ave 3");

        // Enter 123456 at //*[@id="address--city"]
        WebElement cityField = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"address--city\"]"));
        cityField.sendKeys("Singapore");

        // Enter 460401 at //*[@id="address--postalCode"]
        WebElement postalCodeField = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"address--postalCode\"]"));
        postalCodeField.sendKeys("460401");


        // Enter 1234567890 at //*[@id="phoneNumber--phoneNumber"]
        WebElement phoneNumberField = driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"phoneNumber--phoneNumber\"]"));
        phoneNumberField.sendKeys("91387540");

        // Click /html/body/div/div/div/div[2]/div/main/div/div[3]/div[2]/div[3]/div/button
        WebElement submitButton = driver.findElement(org.openqa.selenium.By.xpath("/html/body/div/div/div/div[2]/div/main/div/div[3]/div[2]/div[3]/div/button"));
        submitButton.click();

        // Close the browser
        driver.quit();

    }
}
