package cn.ssx.pageObjects;

import cn.ssx.until.ObjectMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shao on 2019/5/16.
 */

public class LoginPage {
    private WebElement element ;
    //指定页面元素定位表达式配置文件
    private ObjectMap objectMap = new ObjectMap("test.properties");
    private WebDriver webDriver;
    public LoginPage(WebDriver webDriver){
        this.webDriver =webDriver;
    }

    public WebElement loginname()throws Exception{
        //test.propertiees中“=”后面的内容就是getlocator的内容
        element=webDriver.findElement(By.id(objectMap.getlocator("loginname")));
        System.out.println(element);
        return element;
    }
    public WebElement passwd() throws Exception{
        element = webDriver.findElement(By.id(objectMap.getlocator("passwd")));
        System.out.println(element);
        return element;
    }

}
