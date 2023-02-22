package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTestChrome {

    public static void main(String[] args) throws InterruptedException {

        //link to chromedriver
        System.setProperty("webdriver.chrome.driver","C:\\UnifySoftwareTesting\\WebDrivers\\chromedriver.exe");

        //create instance
        WebDriver driver = new ChromeDriver();

        //navigate to URL

        // Launch Website
        driver.get("https://demo.nopcommerce.com/");

        // getTitle() to obtain page title
        // System.out.println("Page title is : " + driver.getTitle());

        // 2.
        String PageTitle = driver.getTitle();
        System.out.println("Page Title Is: " + PageTitle);
        String expectedTitle = "nopCommerce demo store";

        if(PageTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");

        // Navigation Locators - Element    .click is abstract method
        // Click on Login link
        driver.findElement(By.className("ico-login")).click();

        // Go back to Home Page
        driver.navigate().back();

        //maximise window
        driver.manage().window().maximize();

        //Sleep Timer Wait time
        Thread.sleep(2000);
        //minimise window
        driver.manage().window().minimize();

        //maximise window
        driver.manage().window().maximize();

        //Sleep Timer Wait time
        Thread.sleep(2000);

        // Refresh browser
        driver.navigate().refresh();

        String URL = driver.getCurrentUrl();
        System.out.println("URL Is: " + URL);
        String correctURL = "https://demo.nopcommerce.com/";

        if(URL.equalsIgnoreCase(correctURL))
            System.out.println("URL Matched");
        else
            System.out.println("URL didn't match");

        // Close browser
        driver.close();

    }
}
