package CnnCommon;

import base.Base;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 4/6/14
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class TopNews extends Base {

    public void clickOnNews(String locator){
        List<String> news = getListOfString(locator);
        for(String st:news){
            System.out.println(st);
        }
    }
}
