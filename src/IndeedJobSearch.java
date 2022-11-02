import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndeedJobSearch {
    public static void main(String[] args) {
        // chrome driver location
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://indeed.com");
        WebElement findByName = driver.findElement((By.name("q")));
        findByName.sendKeys("Junior QA tester");
        findByName.submit();
        // to get latest url
        System.out.println(driver.getCurrentUrl());
        // to go back or forward
        driver.navigate().back();
        driver .navigate().forward();

    // to quit: driver.quit();

    }
}
