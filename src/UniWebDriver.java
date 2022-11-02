// import everything we'll need to use
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class UniWebDriver {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        // chrome driver implements the Webdriver(interface)

        //to access the website
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        // insert values or keys in the text box and login

        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("webdriver");

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("webdriver123");

        /* using css selector locator to login
         can also use xpath locator use By.xpath("and get xpath through inspect") */
        WebElement login = driver.findElement(By.cssSelector("#login-button"));
        login.click();

//  WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//        login.click();

        //to hold some time
        Thread.sleep(3000);
        // to dismiss or accept the alert box
        driver.switchTo().alert().accept();

    }
}
