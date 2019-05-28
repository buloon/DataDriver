package cn.ssx.testScripts;

import cn.ssx.appModules.Login_Action;
import cn.ssx.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by shao on 2019/5/16.
 */
public class TestLogin {
    public WebDriver webDriver;
    public  String url = "http://";
    @Test
    public void tsetlogin1( ) throws  Exception{
        webDriver.get(url +"/");
        LoginPage loginPage =new LoginPage();
        //相同与webDriver.findElement(By.id("xx")).sendKeys("admin");xx是loginname
        //中loginname方法的参数
        /*loginPage.loginname().sendKeys("admin");
        loginPage.passwd().sendKeys("admin");
        webDriver.findElement(By.id("loginbutton")).click();
        Thread.sleep(5000);*/
        Login_Action.execute(webDriver,"admin","admin");
        Thread.sleep(5000);
        Assert.assertTrue(webDriver.getPageSource().contains("登陆成功"));
    }

    @BeforeClass
    public void before() throws Exception{
        System.setProperty("webdriver.firefox.bin","驱动地址");
        webDriver =new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void after() throws  Exception{

        webDriver.quit();
    }
}
