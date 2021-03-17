package changeBotton;
/*
 *反射通过配置文件，运行指定的类和方法
 * 配置文件 写运行类，运行的方法
 * 读取配置文件，获取键值对
 * 类名和方法名交给反射
 */
import  java.lang.reflect.*;
import java.util.*;
import java.io.*;

public class LoginForm {
    public static void main(String args[]) throws Exception{
        //创建集合对象
        Properties pro = new Properties();
        //创建IO流，读取配置文件
        FileInputStream fis = new FileInputStream("C:\\IdeaProjects\\test02\\config.txt");
        //集合方法load，将读取到的键值对，存储到集合
        pro.load(fis);
        fis.close();
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //获取指定类的class文件对象
        Class c1 = Class.forName(className);
        //建立对象
        Object button = c1.newInstance();
        //通过字节码文件对象Class类，获取指定方法
        Method display = c1.getMethod(methodName);
        //运行方法
        display.invoke(button);
    }
}
