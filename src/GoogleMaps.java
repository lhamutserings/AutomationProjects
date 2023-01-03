import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class GoogleMaps {
        public static void main(String[] args) throws InterruptedException {

// using firefox driver
            System.setProperty("webdriver.gecko.driver", "/Users/lhamusherpa/Documents/AUTOMATION/geckodriver");
            WebDriver driver = new FirefoxDriver(); //create a webdriver object
            driver.get("https://www.google.com/maps");
            WebElement search = driver.findElement(By.id("searchboxinput"));
                    search.sendKeys("666 park avenue ");


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(2000);
            Actions searchMagnify = new Actions(driver); //import action class for performing double click on exit
            WebElement sM = driver.findElement(By.xpath("//*[@id=\"searchbox-searchbutton\"]"));
            searchMagnify.click(sM).perform();

            driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[3]/div/a")).click();

            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div[1]/div[3]/div/div[1]/div/div/div[2]/div[4]/div[1]/button/span/img")).click();

Thread.sleep(2000);
            driver.findElement(By.cssSelector("/html/body/div[3]/div[9]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/input")).sendKeys("my location");

        }
}
