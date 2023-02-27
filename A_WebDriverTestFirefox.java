package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_WebDriverTestFirefox {

    public static void main(String[] args) throws InterruptedException {

        //link to chromedriver
        System.setProperty("webdriver.gecko.driver","C:\\UnifySoftwareTesting\\WebDrivers\\geckodriver.exe");

        //create instance
        WebDriver driver = new FirefoxDriver();

        //navigate to URL

        // Launch Website
        driver.get("https://demo.nopcommerce.com/");
    }
}
