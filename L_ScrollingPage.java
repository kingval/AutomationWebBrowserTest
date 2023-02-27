package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_ScrollingPage {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://demo.nopcommerce.com/");

        //JS-Executor
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

//1        // pixel Scrolling
     //   js.executeScript("window.scrollBy(0,1000)");

//2.
        //Scroll By Element
      //  WebElement news = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[1]/strong"));
      //  js.executeScript("argument[0].scrollIntoView();",news);

//3.
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//4.
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1000)");



    }
}
