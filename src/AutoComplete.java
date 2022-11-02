import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver(); //create a webdriver object
        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
         driver.findElement(By.name("food-item")).sendKeys("a");
         //implicit wait for 3 secs
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

         WebElement a = driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]"));
        String name = a.getAttribute("value");

    }
}
