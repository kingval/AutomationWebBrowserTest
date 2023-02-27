package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Property
Syntax - - //htmltag[@Property='value']
//button[@class="button-1 login-button"]

2. multiple properties

syntax //htmltag[@Property='value' and @Property='value']
    //button[@type='submit' and @class='button-1 login-button']

3.  using Contain() in xpath

//htmltag[contains(@Property, 'value')]

4. With and Without Contains

//htmltag[@Property='value' and contains(@Property, 'value')]

5. Text
//htmltag[text()='value']



 */

public class D_CustomXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(3000);

        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("button[@type='submit' and @class='button-1 login-button']")).click();
        driver.findElement(By.xpath("button[@class='button-1 login-button']")).click();



    }
}
