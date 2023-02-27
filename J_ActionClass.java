package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class J_ActionClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/droppable/accepted-elements.html");
        Thread.sleep(2000);

        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
        Thread.sleep(2000);





    }

}
