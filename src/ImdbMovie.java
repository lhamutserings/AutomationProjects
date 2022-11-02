import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImdbMovie {
    public static void main(String[] args) {
        // chrome driver location
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://imdb.com");
        // create web element object to access certain parts by the id found in web.inspect
        WebElement findById = driver.findElement((By.id("suggestion-search")));
        findById.sendKeys("Scream");
        findById.submit(); // to send value
    }
}
