//hover over a box and click the hidden text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HoverWebUni {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // got to actions
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[9]/a/div/div[1]/h1")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

// introduce actions class for mouse/keyboard work
        Actions action = new Actions(driver);
        // introduce link to hover over here first
        WebElement hover = driver.findElement(By.className("dropbtn"));
        int l = 2000;
        //then we move to hover. then to the link and click
        action.moveToElement(hover).pause(l).moveToElement(driver.findElement(By.cssSelector("div.dropdown:nth-child(1) > div:nth-child(2) > a:nth-child(1)"))).click().build().perform();

      //dismiss alert box
        Thread.sleep(l);
        driver.switchTo().alert().dismiss();

        //close tab and browser
        driver.close();
        Thread.sleep(l);
        driver.close();
    }
}
