package homePageElements;

import base.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by ahoura on 1/31/17.
 */
public class dropDownSearch extends CommonMethods {
    public dropDownSearch (WebDriver driver){
        this.driver =driver;
    }

   @FindBy(how = How.ID, using = "pn-mens")
    public static WebElement mens;

    @FindBy(how = How.ID, using = "pn-womens")
    public static WebElement womens;

    @FindBy(how = How.ID, using = "pn-kids")
    public static WebElement kids;

    @FindBy(how = How.ID, using = "pn-outdoor-gear")
    public static WebElement outDoorGear;

    public void MensColoumn() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(mens);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> mensDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : mensDropDown) {
            System.out.println(element.getText());
        }
    }
    public void WomensColoum() throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(womens);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> WomensDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : WomensDropDown) {
            System.out.println(element.getText());
        }
    }
    public void KidsColoumn() throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(kids);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> kidsDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : kidsDropDown) {
            System.out.println(element.getText());
        }
    }
    public void OutDoorGearColoumn() throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(outDoorGear);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> GearDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : GearDropDown) {
            System.out.println(element.getText());
        }
    }







}

