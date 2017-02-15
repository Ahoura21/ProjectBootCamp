package homePageElements;

import base.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ahoura on 1/30/17.
 */
public class LogInAccount extends CommonMethods{
    public LogInAccount(WebDriver driver){
        this.driver= driver;
    }
    @FindBy(how= How.XPATH, using =".//*[@id='page']/header/nav[1]/ul/li[6]/button")
           public static WebElement loginButton;
    @FindBy(how=How.XPATH,using = ".//*[@id='loginEmail']")
            WebElement userName;
    @FindBy(how=How.XPATH,using=".//*[@id='loginPassword']")
            WebElement passWord;
    @FindBy(how=How.XPATH,using =".//*[@id='loginButton']")
            WebElement submitLogin;






    public void logInMeth(String uID , String uPassW) throws InterruptedException {

        loginButton.click();
        Thread.sleep(3000);
        driver.switchTo().frame("loginLayer");
        Thread.sleep(1000);
        userName.sendKeys(uID);
        passWord.sendKeys(uPassW);
        submitLogin.click();

    }



}
