package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class K2_Utils {

    public static void selectValueFromDropDown (WebElement element, String Value) {

        Select select = new Select(element);
        select.selectByVisibleText(Value);

    }

}
