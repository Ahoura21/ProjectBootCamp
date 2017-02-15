package homePageElements;

import base.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by ahoura on 2/3/17.
 */
public class SearchNcheckOut extends CommonMethods{

    public SearchNcheckOut (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how= How.XPATH, using= ".//*[@id='pn-mens']")
   public static WebElement mensColumn;
    @FindBy(how= How.XPATH,using= "//a[text()='Blazers']")
  public  static   WebElement Blazer;
    @FindBy(how=How.XPATH, using="//button[@class ='SB_PopInEditButton btn btn-white-green']")
    public static WebElement continueShopping;
    @FindBy(how = How.ID, using = "pn-womens")
    public static WebElement womens;
    @FindBy(how= How.XPATH,using= "//a[text()='Skirts & Dresses']")
    public static WebElement skirt;
    @FindBy(how=How.XPATH,using =".//*[@id='page']/header/div[2]/ul/li[3]/a[1]/div")
    public static WebElement shoppingCart;

   public  void runFirst() throws InterruptedException {
       Actions action = new Actions(driver);
       action.moveToElement(mensColumn).click().perform();
       Thread.sleep(3000);
       Blazer.click();
       Thread.sleep(5000);
       driver.findElement(By.xpath(".//*[@id='fourUpContainer']/div[3]/div[2]/h3/a")).click();
       driver.findElement(By.xpath(".//*[@id='ppOrderItemForm-0']/div[1]/div[1]/div/div[1]/fieldset/label[1]")).click();
       driver.findElement(By.xpath(".//*[@id='ppOrderItemForm-0']/div[1]/div[2]/div/div/fieldset/label[1]")).click();
       driver.findElement(By.xpath(".//*[@id='ppOrderItemForm-0']/div[3]/button")).click();
       continueShopping.click();

    }
    public void runSecond() throws InterruptedException{
       Actions action = new Actions(driver);
       action.moveToElement(womens).click().perform();
       Thread.sleep(3000);
       skirt.click();
       driver.findElement(By.xpath("//a[text()='Summer Knit Dress']")).click();
       driver.findElement(By.xpath(".//*[@id='ppOrderItemForm-0']/div[1]/fieldset/label[2]")).click();
       driver.findElement(By.xpath(".//*[@id='ppOrderItemForm-0']/div[2]/div[1]/div/div[1]/fieldset/label[4]")).click();
       driver.findElement(By.xpath(".//*[@id='ppOrderItemForm-0']/div[4]/button")).click();
       continueShopping.click();
    }
    public void ScreenShot() throws IOException, InterruptedException {
       shoppingCart.click();
       Thread.sleep(1000);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("screenShots.png"));
    }


    }


