
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllCountriesList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        //first creating box as a web element
        WebElement Box = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[5]/div/div[2]/div[3]/div[2]"));
       // create a list for elements inside the box
        List<WebElement> southAmerica = Box.findElements(By.tagName("a"));

        for (WebElement southAM : southAmerica) {
            System.out.println(southAM.getText());
        }


    }
}
