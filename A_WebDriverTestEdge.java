package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A_WebDriverTestEdge {

    public static void main(String[] args) throws InterruptedException {

        //link to chromedriver
        System.setProperty("webdriver.edge.driver","C:\\UnifySoftwareTesting\\WebDrivers\\msedgedriver.exe");

        //create instance
        WebDriver driver = new EdgeDriver();

        //navigate to URL

        // Launch Website
        driver.get("https://www.amazon.co.uk/");

        // getTitle() to obtain page title
        // System.out.println("Page title is : " + driver.getTitle());

        // 2.
        String PageTitle = driver.getTitle();
        System.out.println("Page Title Is: " + PageTitle);
        String expectedTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";

        if(PageTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched");
        else
            System.out.println("Title didn't match");

        String URL = driver.getCurrentUrl();
        System.out.println("URL Is: " + URL);
        String correctURL = "https://www.amazon.co.uk/";

        if(URL.equalsIgnoreCase(correctURL))
            System.out.println("URL Matched");
        else
            System.out.println("URL didn't match");

        // Close browser
        driver.close();




    }
}
