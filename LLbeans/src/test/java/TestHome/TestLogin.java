package TestHome;

import base.CommonMethods;
import homePageElements.LogInAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by ahoura on 1/31/17.
 */
public class TestLogin extends CommonMethods {
    @Test
    public void loginTest() throws InterruptedException {
        LogInAccount TLG = PageFactory.initElements(driver, LogInAccount.class);

        TLG.logInMeth("incorrectEmail" , "invalidPassword");
    }
}
