package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class F_ImplicitWait {
    /*
    Implicit Wait:
    Global Wait: applied to all the elements
    ignore extra seconds save time and performance
    can change code anytime
    implicit wait is available in form of implicitly keyword on selenium

     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123Tester");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // changing the wait time here to 10 seconds as more is not needed


    }


}

