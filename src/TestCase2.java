import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

//Verify the messages for invalid login.
public class TestCase2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");

        driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1")).click();

        ArrayList<String> tab= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));


        driver.findElement(By.id("text")).sendKeys("lhamu");

        driver.findElement(By.id("password")).sendKeys("lhamu123");

        driver.findElement(By.cssSelector("#login-button")).click();

        String text = driver.switchTo().alert().getText();
        System.out.println(text);

        if (text.equals("validation failed") ) {
            System.out.println("Message verified. Test was successful");
        } else {
            System.out.println("Test was unsuccessful.");
        }
        }




}
