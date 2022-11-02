import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberBDD {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver ();
        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");
        //click
        WebElement cBdd = driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
        cBdd.click();
        //get text
        WebElement para = driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]/p"));
        System.out.println(para.getText());

    }
}
