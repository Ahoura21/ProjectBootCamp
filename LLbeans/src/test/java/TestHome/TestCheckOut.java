package TestHome;

import base.CommonMethods;
import com.apple.concurrent.Dispatch;
import homePageElements.SearchNcheckOut;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ahoura on 2/3/17.
 */
public class TestCheckOut extends CommonMethods {

    @Test(priority = 1)
    public void emtehani() throws InterruptedException, IOException {

        SearchNcheckOut snc = PageFactory.initElements(driver , SearchNcheckOut.class);
        snc.runFirst();
        snc.runSecond();
        snc.ScreenShot();
    }




}

