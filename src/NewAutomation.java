//first we need to import
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAutomation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver drive = new ChromeDriver(); //
        drive.get("https://google.com");

        //to submit something on the search box of google;

        WebElement searchBox = drive.findElement(By.name("q"));
        searchBox.sendKeys("QA Automation");
        searchBox.submit();

    }

}
