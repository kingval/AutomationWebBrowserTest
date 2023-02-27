package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class I_FileUpload {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

        Thread.sleep(2000);

        driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\cheta\\IdeaProjects\\SeleniumLearning\\src\\main\\java\\SeleniumConcepts\\123testupload.txt");

        driver.findElement(By.xpath("/html/body/form/input[3]")).click();

    }
}
