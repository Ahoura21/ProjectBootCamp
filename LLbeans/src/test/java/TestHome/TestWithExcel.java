package TestHome;

import base.CommonMethods;
import homePageElements.ExcelSearch;
import homePageElements.SearchElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ahoura on 2/11/17.
 */
public class TestWithExcel extends CommonMethods {
    @Test
    public void search()throws IOException,InterruptedException{
        //Create instance of Excel file reader class
        SearchElements searchExcel = new SearchElements();
        //Page Factory class init
       SearchElements searchEls = PageFactory.initElements(driver, SearchElements.class);
        //Read data from Excel File.
        String [] value = ExcelSearch.getData();
        //Running for each loop
        for(int i=1; i<value.length; i++) {
           searchEls.searchMeth (value[i]);

        }
    }
}
