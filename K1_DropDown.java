package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class K1_DropDown extends K2_Utils {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();



        /*1.

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("6");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1989");

         */

        /* 2.
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Day.sendKeys("11");
        Month.sendKeys("May");
        Year.sendKeys("1989");
        */


        /*

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(Day);
        select.selectByIndex(6);

        Select select1 = new Select(Month);
        select1.selectByIndex(4);

        Select select2 = new Select(Year);
        select2.selectByIndex(77);

        */

        // 3. Reusable method
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        selectValueFromDropDown(Day,"15");
        selectValueFromDropDown(Month,"July");
        selectValueFromDropDown(Year,"1984");


    }

}
