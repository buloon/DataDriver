package cn.ssx.appModules;

import cn.ssx.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by shao on 2019/5/16.
 */
public class Login_Action {
    public static void execute(WebDriver webDriver,String loginname,String passwd) throws Exception{
        webDriver.get("http://192.168.31.62:8080/login"+"/");

        LoginPage loginPage = new LoginPage();
        loginPage.loginname().sendKeys("loginname");
        loginPage.passwd().sendKeys("passwd");
        webDriver.findElement(By.id("loginbutton")).click();
    }
}
