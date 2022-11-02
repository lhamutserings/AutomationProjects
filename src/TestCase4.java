import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

// check if password was invisible while typing
public class TestCase4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");

        driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();

        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));

        driver.findElement(By.id("password")).sendKeys("lhamu123");
        String text = driver.

    }
}
