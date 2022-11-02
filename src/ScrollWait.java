import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver(); //create a webdriver object
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        //driver.manage().timeout().implicitwait(time 20, timeunit seconds);


    }
}
