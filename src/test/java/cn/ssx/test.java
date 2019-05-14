package cn.ssx;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by shao on 2019/5/14.
 */
public class test {


        public static void main(String[] args) throws IOException {
            Properties properties = new Properties();
            //properties.load(new FileInputStream("test.properties"));
            System.out.println(properties.getProperty("lisi"));
            System.out.println(properties.getProperty("zhangsan"));
        }
    }



