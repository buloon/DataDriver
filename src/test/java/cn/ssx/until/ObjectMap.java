package cn.ssx.until;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by shao on 2019/5/14.
 */
public class ObjectMap {
    Properties properties;
    private static Logger Log = Logger.getLogger(ObjectMap.class.getName());

    public ObjectMap(String filename){
        String profile = ObjectMap.class.getClassLoader().getResource(filename).getPath();
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

    public String getlocator(String ElemnetNameInprofile) throws Exception{
        //根据变量elemenameinprofile，从属性配置文件中读取对应的配置文件，变量locator是读取出的内容
        String locator = properties.getProperty(ElemnetNameInprofile);
        String locatorType = locator.split("=")[0];
        String locatorVaule = locator.split("=")[1];
        //用getbyte方法将字符串编码转换为UTF-8，解决配置文件中文乱码
        locatorVaule = new String(locator.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println("获的定位类型取"+locatorType+"\t获取的表达式"+locatorVaule);
        if (locatorType.toLowerCase().equals("loginname"))
            return locatorVaule;
        else if (locatorType.toLowerCase().equals("passwd"))
            return locatorVaule;
        else
            throw new Exception("");

    }



}
