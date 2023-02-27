package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.time.Duration.*;

public class G_ExplicitWait {

    /*
    Explicit Wait is more powerful than Implicit Wait
    available inform of webdriver wait ( Predefined = wait class)
    if we don't know the time the best approach is explicit wait
    can handle web elements and non web elements
    no explicitly keyword or methods.

    specific elements wait

     */


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(30));

        wait.until(ExpectedConditions.titleContains("nopCommerce"));

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123Tester");

        WebDriverWait wait2 = new WebDriverWait(driver, ofSeconds(10));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")));

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

}
