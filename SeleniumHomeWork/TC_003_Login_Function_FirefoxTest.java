package SeleniumConcepts.SeleniumHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class TC_003_Login_Function_FirefoxTest {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("nopCommerce"));

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("king.valand@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Tester001!");

        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //Syntax - - //htmltag[@Property='value']
        //button[@class="button-1 login-button"]

    }

}
