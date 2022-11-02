import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver(); //create a webdriver object
        driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");

        WebElement input = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
        input.click();




    }
}