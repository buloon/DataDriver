package cn.ssx.pageObjects;

import cn.ssx.until.ObjectMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shao on 2019/5/19.
 */
public class HomePage {
    private WebElement webElement = null;
    private WebDriver webDriver;
    private ObjectMap objectMap = new ObjectMap("test.properties");

    public  HomePage(WebDriver webDriver){
        this.webDriver =webDriver;
    }

    public WebElement addresslink() throws  Exception{
        webElement= webDriver.findElement(By.id(objectMap.getlocator("addresslink")));
        return webElement;
    }

}
