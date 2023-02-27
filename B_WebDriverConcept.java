package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_WebDriverConcept {

    public static void main(String[] args) {

        /*
        market utility to launch browser without exe file.
        to overcome setting driver path can use bonigarcia.
        API will run diff browser without installing and setting a path.
        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://demo.nopcommerce.com/");

    }


}
