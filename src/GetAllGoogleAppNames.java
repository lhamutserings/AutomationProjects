import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class GetAllGoogleAppNames {


        public static void main(String[] args) {

            // Launching browser
            System.setProperty("webdriver.gecko.driver", "/Users/lhamusherpa/Documents/AUTOMATION/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // Loading Google
            driver.get("https://www.google.com/");

            // Google Apps icon
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/div/div/div/a")).click();

            //only two frames available: parent frame and apps frame, switch frames
          int size2 = driver.findElements(By.tagName("iframe")).size();
          System.out.println(size2);
            driver.manage().window().maximize();
            driver.switchTo().frame(1);

            //Create xpath manually using syntax: //tagname[@attribute='value']
            //put all the apps in a list and print ea
            List<WebElement> copyAll = driver.findElements(By.xpath("//div[@id='yDmH0d']"));
           // why doesn't the class/classname work at all--> List<WebElement> copyAll = driver.findElements(By.className("VUoKZ"));
            for (WebElement appsName : copyAll) {
               System.out.println(appsName.getText());
           }
           // click on maps icon in the same frame and find nearby restaurants
          //for restaurants:  driver.findElement(By.xpath("//a[@href='https://maps.google.com/maps?hl=en']") ).click();

            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            System.out.println(tabs.size()); //page opened in same tab

            Actions hover = new Actions(driver);
            WebElement body = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[1]/div[3]/canvas"));
            WebElement restaurant = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[5]/div/div/div/div[1]/div/div/div/div/div[5]/div[2]/div[1]/div/button"));
            hover.moveToElement(body).moveToElement(restaurant).click().build().perform();




        }
    }

