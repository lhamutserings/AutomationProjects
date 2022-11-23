import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Iteration {
    public static void main(String[] args) throws InterruptedException {

        // Launching browser
        System.setProperty("webdriver.gecko.driver", "/Users/lhamusherpa/Documents/AUTOMATION/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Loading Google
        driver.get("https://www.google.com/");

        // Google Apps icon
        WebElement dots = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a"));
        dots.click();

        //only two frames available: parent frame and apps frame, switch frames //frame within a frame
        driver.manage().window().maximize();
        driver.switchTo().frame(1);
Actions drive;
     drive = new Actions(driver);
        WebElement googleDrive = driver.findElement(By.xpath("//a[@href='https://drive.google.com/']"));
        drive.moveToElement(googleDrive);
        drive.click().perform();

        Thread.sleep(3000);
        WebElement signIn = driver.findElement(By.xpath("/html/body/header/div[3]/div/div[4]/div/a[1]"));
        signIn.click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.navigate().back();

        driver.switchTo().frame(0);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();



        //click dots again
       driver.navigate().refresh();
       //WebElement dots2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a"));
       WebElement dots2= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a"));
        dots2.click();

        int frame = driver.findElements(By.tagName("iframe")).size();
        System.out.println(frame);
        driver.switchTo().frame(0);

        WebElement youTube = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/']"));
        drive.moveToElement(youTube);
        drive.click().perform();
        driver.navigate().refresh();


        WebElement song = driver.findElement(By.xpath("//*[@id=\"search\"]"));
        drive.moveToElement(song).sendKeys("Hey Jude");
        drive.click().build().perform();



    }
}
