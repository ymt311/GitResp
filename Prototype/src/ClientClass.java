import pro.Apple;
import pro.Banana;
import pro.MyFruit;
import pro.MyFruitStore;

public class ClientClass {
    public static void main(String args[]){
        //MyFruit fru=new Banana();
        //MyFruit fru1= (Banana) fru.clone();
        //fru.Display();
        //fru1.Display();
        //System.out.println("fru:"+fru.hashCode());
        //System.out.println("fru1:"+fru1.hashCode());
        //System.out.println(fru==fru1);

        //向货架中添加水果
        MyFruit fru1=new Apple();
        MyFruit fru2=new Banana();
        MyFruitStore.Add(1,fru1);
        MyFruitStore.Add(2,fru2);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());

        //取水果
        MyFruit fru=MyFruitStore.Get(4);
        fru.Display();
    }
}
