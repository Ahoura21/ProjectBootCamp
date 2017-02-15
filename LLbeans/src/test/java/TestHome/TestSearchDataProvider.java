package TestHome;

import base.CommonMethods;
import homePageElements.SearchElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by ahoura on 2/1/17.
 */
public class TestSearchDataProvider extends CommonMethods {

    @DataProvider(name = "lists")
   public Object[][] createData() {
       return new Object[][]{
               {"hats"},
               {"shirt"},
               {"boots"},
               {"tops"},
       };
   }



    @Test(dataProvider = "lists")
    public void testRunSearch(String searchList) throws InterruptedException {
        SearchElements searchJobs = PageFactory.initElements(driver, SearchElements.class);
        searchJobs.searchMeth(searchList);
    }



}
