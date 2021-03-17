package Transform;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class MainClass {
    public static void main(String args[]) throws Exception{
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream("C:\\IdeaProjects\\test03\\config.txt");
        pro.load(fis);
        fis.close();
        String sourceName = pro.getProperty("sourceName");
        String methodName1 = pro.getProperty("methodName1");
        String transformerName = pro.getProperty("transformerName");
        String methodName2 = pro.getProperty("methodName2");

        //获取指定类的class文件
        Class c1 = Class.forName(sourceName);
        Object o1 = c1.newInstance();
        Method m1 = c1.getMethod(methodName1);
        m1.invoke(o1);

        Class c2 = Class.forName(transformerName);
        Object o2 = c2.newInstance();
        Method m2 = c2.getMethod(methodName2);
        m2.invoke(o2);

    }
}
