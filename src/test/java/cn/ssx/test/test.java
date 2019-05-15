package cn.ssx.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by shao on 2019/5/14.
 */
public class test {


        public static void main(String[] args) throws FileNotFoundException,IOException {
            Properties properties = new Properties();
            String path = test.class.getClassLoader().getResource("test.properties").getPath();
            properties.load(new FileInputStream(path));
            /*System.out.println(properties.getProperty("lisi"));
            System.out.println(properties.getProperty("zhangsan"));*/
            Enumeration enuml = properties.propertyNames();
            while(enuml.hasMoreElements()) {
                            String strKey = (String) enuml.nextElement();
                             String strValue = properties.getProperty(strKey);
                            System.out.println(strKey + "=" + strValue);
                         }
        }
    }



