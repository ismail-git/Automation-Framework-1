package home;

import CnnCommon.Page;
import base.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 4/10/14
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class TopNav extends Page {
    DataReader dataReader = new DataReader();
    String [][] locators;
    @Test
    public void topNav() throws IOException {
        String path = "/Users/ismailosmanjan/IdeaProjects/Automation-Framework-1/excelfile.xls";
        locators = dataReader.fileReader(path);
        for(int i=0; i<locators.length; i++){
            for(int j=1; j<2; j++){
                String locator = locators[i][j];
                clickByCss(locator);
            }
        }
    }
}
