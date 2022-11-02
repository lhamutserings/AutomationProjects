import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenJavaChannel {
    public static void main(String[] args) {

// chrome driver ko location is in this one
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver drive = new ChromeDriver(); //
        drive.get("https://javaguide.technologychannel.org/");



    }
}