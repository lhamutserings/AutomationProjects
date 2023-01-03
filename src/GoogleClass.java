import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/lhamusherpa/Documents/AUTOMATION/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement apps = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div"));
        apps.click();
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[4]/iframe")));
driver.findElement(By.name("callout")).click();
      //  List<WebElement> copyAll = driver.findElements(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]"));
    //    for (WebElement appsName: copyAll) {
         //   System.out.println(appsName.getText());
        }


    }


