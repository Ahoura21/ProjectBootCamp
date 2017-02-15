package homePageElements;


import base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ahoura on 2/1/17.
 */
public class SearchElements extends CommonMethods {
    @FindBy(how= How.XPATH, using =".//*[@id='search-string']")
    WebElement searchField;
    @FindBy(how= How.XPATH, using =".//*[@id='search']/div/button[1]")
    WebElement searchSubmit;


    public void searchMeth(String searchList) throws InterruptedException {
        searchField.sendKeys(searchList);
        searchSubmit.click();
        Thread.sleep(200);
    }



}
