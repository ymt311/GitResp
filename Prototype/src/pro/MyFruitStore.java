package pro;

import java.util.Hashtable;

public class MyFruitStore {
    //水果架(货架号，水果)
    private static Hashtable fruittable=new Hashtable<Integer,MyFruit>();
    public static void Add(Integer key,MyFruit fruit){     //添加水果
        fruittable.put(key,fruit);
    }
    public static MyFruit Get(Integer key){             //取水果
        MyFruit fruit= (MyFruit) fruittable.get(key);
        return (MyFruit) fruit.clone();  //把水果架中的相应水果克隆一份
    }
}
