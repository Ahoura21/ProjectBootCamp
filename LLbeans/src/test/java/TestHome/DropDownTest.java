package TestHome;

import base.CommonMethods;
import homePageElements.dropDownSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;



/**
 * Created by ahoura on 1/31/17.
 */
public class DropDownTest extends CommonMethods {



    @Test(priority = 1)
    public void runTestMens() throws InterruptedException {

        dropDownSearch dps = PageFactory.initElements(driver, dropDownSearch.class);
        dps.MensColoumn();
        /*Actions actions = new Actions(driver);
        actions.moveToElement(mens);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> mensDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : mensDropDown) {
            System.out.println(element.getText());
        }*/
    }


    @Test(priority = 2)
    public void runTestWomens() throws InterruptedException {

        dropDownSearch dps = PageFactory.initElements(driver, dropDownSearch.class);
        dps.WomensColoum();
        /*    Actions actions = new Actions(driver);
        actions.moveToElement(womens);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> WomensDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : WomensDropDown) {
            System.out.println(element.getText());
        }*/
    }

    @Test(priority = 3)
    public void runTestKids() throws InterruptedException {

        dropDownSearch dps = PageFactory.initElements(driver, dropDownSearch.class);
        dps.KidsColoumn();
      /*  Actions actions = new Actions(driver);
        actions.moveToElement(kids);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> kidsDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : kidsDropDown) {
            System.out.println(element.getText());
        }*/
    }
    @Test(priority = 4)
    public void runTestGear() throws InterruptedException {

        dropDownSearch dps = PageFactory.initElements(driver, dropDownSearch.class);
        dps.OutDoorGearColoumn();
        /*Actions actions = new Actions(driver);
        actions.moveToElement(outDoorGear);
        actions.perform();
        Thread.sleep(1000);
        List<WebElement> GearDropDown = driver.findElements(By.xpath(".//div[@class='menu-content']"));
        for (WebElement element : GearDropDown) {
            System.out.println(element.getText());
        }*/
    }


}

