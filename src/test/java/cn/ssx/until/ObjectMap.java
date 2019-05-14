package cn.ssx.until;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by shao on 2019/5/14.
 */
public class ObjectMap {
    Properties properties;
    private static Logger Log = Logger.getLogger(ObjectMap.class.getName());
    public ObjectMap(String profile){
        try {
            FileInputStream in= new FileInputStream(profile);
            //读取java配置文件
            properties.load(in);
        }
        catch (Exception e){
            System.out.println("读取文件出错");
            Log.info("读取文件出错");
            e.printStackTrace();
        }
    }

    public By getlocator(String ElemnetNameInprofile) throws Exception{
        //根据变量elemenameinprofile，从属性配置文件中读取对应的配置文件
        String locator = properties.getProperty(ElemnetNameInprofile);
        String locatorType = locator.split("-")[0];
        String locatorVaule = locator.split("-")[1];
    }

}
