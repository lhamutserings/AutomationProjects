import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTask {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/lhamusherpa/Documents/AUTOMATION/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Open the link
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        //to maximize the screen // for full screen .fullscreen
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // to click on the yellow radio button
        driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/input[3]")).click();

       //uncheck option 3 and check option 4
        Thread.sleep(2000);
        WebElement uncheck = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));
        uncheck.click();

        Thread.sleep(1000);
        WebElement check = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]"));
        check.click();

        Thread.sleep(3000);
        driver.close();

    }
}
