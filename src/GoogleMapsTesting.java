
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

    public class GoogleMapsTesting {
        public static void main(String[] args) throws InterruptedException {

// using firefox driver
            System.setProperty("webdriver.gecko.driver", "/Users/lhamusherpa/Documents/AUTOMATION/geckodriver");
            WebDriver driver = new FirefoxDriver(); //create a webdriver object
            driver.get("https://www.google.com/maps");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Action class for mouse/keyboard use
// First move to the entire body using xpath (NB mouse hovers to body first then to restaurant) then to restaurant
// Hovering mouse from body to restaurant
// build()- used to compile all the actions into a single step

            Actions actions = new Actions(driver);
            WebElement body = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[1]/div[3]/canvas"));
            WebElement restaurant = driver.findElement(By.cssSelector("div.KNfEk:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
            actions.moveToElement(body).moveToElement(restaurant);
            actions.click().build().perform();

/* For sortbyprice feature, no need to move to body since we're already there
and no need for hover/action init since its buttonclick */
            WebElement sortByPrice = driver.findElement(By.cssSelector("div.ArRoUb:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
            sortByPrice.click();
            WebElement twoDollarSigns = driver.findElement(By.cssSelector("div.MMWRwe:nth-child(2)"));
            twoDollarSigns.click();

            Thread.sleep(3000);
            WebElement ratings = driver.findElement(By.cssSelector("div.ArRoUb:nth-child(2) > div:nth-child(1) > button:nth-child(1)"));
            ratings.click();
            WebElement fiveRated = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[7]"));
            fiveRated.click();

            // actions.moveToElement(fiveRated); [works without action class because its just buttonclick, not hover
            // actions.click().build().perform();

            Thread.sleep(10000);
// WebElement pickOne and look at its menu
            driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[5]/div/a")).click();
            driver.findElement(By.cssSelector("html body.LoJzbe.keynav-mode-off.highres.screen-mode div#app-container.vasquette.id-app-container.y2iKwd.cSgCkb.xcUKcd.pane-open-mode.VElZUe div#content-container.id-content-container div#QA0Szd div div.XltNde.tTVLSc div.w6VYqd div.bJzME.Hu9e2e.tTVLSc div.k7jAl.lJ3Kh.miFGmb div.e07Vkf.kA9KIf div.aIFcqe div.m6QErb.WNBkOb div.m6QErb.DxyBCb.kA9KIf.dS8AEf div.m6QErb div.RcCsl.rJl64b.w4vB1d.NOE9ve.M0S7ae.AG25L a.CsEnBe div.AeaXub")).click();

// switch to different tab to menus
            Thread.sleep(3000);
            ArrayList<String> tabs = new ArrayList <> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

            //type noodles in search box of menu
            //WebElement noodles = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/div/div/div/input"));
            // noodles.sendKeys("banh mi");
            // noodles.submit();

            WebElement banhMi = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[3]/div/button[5]"));
            banhMi.click();


        }
    }


