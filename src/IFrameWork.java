//WAP to switch between frames and perform calculation

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameWork {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        // chrome driver implements the Webdriver(interface)
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");
        // to maximize the screen
        driver.manage().window().maximize();

driver.switchTo().frame("ourframe");
        WebElement intro = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));
        intro.click();

        WebElement installJava = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[2]/a"));
        installJava.click();
        //switch back to the calculator
        driver.switchTo().defaultContent();
// send numbers and then add
        WebElement num1 = driver.findElement(By.id("num1"));
        num1.sendKeys("200");

        WebElement num2 = driver.findElement(By.id("num2"));
        num2.sendKeys("300");

        WebElement add = driver.findElement(By.tagName("Button")); //only where there is only one button tag
        add.click();

        Thread.sleep(3000); // to hold for 3s

        driver.close(); //closes current tab after 3s

        driver.quit(); //closes whole browser

    }
}
