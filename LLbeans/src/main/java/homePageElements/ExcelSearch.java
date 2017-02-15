package homePageElements;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by ahoura on 2/11/17.
 */
public class ExcelSearch {
    static DataReader dr = new DataReader();
    public static String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
