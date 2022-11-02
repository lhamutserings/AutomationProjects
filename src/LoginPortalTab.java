import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
public class LoginPortalTab {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Open the link
        driver.get("https://webdriveruniversity.com/");
        //to maximize the screen // for full screen .fullscreen
        driver.manage().window().maximize();

        //access login portal using css selector
       WebElement login = driver.findElement(By.cssSelector("#login-portal > div:nth-child(1) > div:nth-child(1) > h1:nth-child(1)"));
       login.click(); //add thread.sleep() to hold for some time

       //next we need to switch tabs
        //introduce array to get the number oftabs
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        System.out.println(tabs.size());           //put tabs only to get tabs name
        driver.switchTo().window(tabs.get(1));

        // insert values or keys in the text box and login

        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("webdriver");

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("webdriver123");

        /* using css selector locator to login
         can also use xpath locator use By.xpath("and get xpath through inspect") */
        WebElement loginNow = driver.findElement(By.cssSelector("#login-button"));
        loginNow.click();

        //to hold some time
        Thread.sleep(2000);
        // to dismiss or accept the alert box
        driver.switchTo().alert().accept();

        //to close the current tab
        driver.close();
        //switch to tab0
        driver.switchTo().window(tabs.get(0));



    }
}