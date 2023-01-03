// WAP to automate opening google
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationUsingChromedriver {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://google.com");

    }
}
