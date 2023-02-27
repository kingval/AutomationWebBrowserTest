package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Locators {

    /*
    Web elements  - functionalities
    using web elements to automate my script
    to interact with each element - automation script requires locators

ID
ClassName
Xpath
CSS Selector
LinkText
Partial Link Text
TagNAme
FullPath
     */


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(3000);

        driver.findElement(By.className("ico-login")).click();
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
//        driver.findElement(By.linkText("Log in")).click();
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123Tester");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();


    }


}

