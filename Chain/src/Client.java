import java.util.Random;

public class Client {
    public static void main(String args[]){
        AbstractFruitSort Bfs,Mfs,Sfs;   //分别创建大、中、小水果分拣器
        Bfs=new BigFruitSort(9);
        Mfs=new MidFruitSort(5);
        Sfs=new SmallFruitSort(2);

        //设置职责链
        Bfs.setNextFruitSort(Mfs);
        Mfs.setNextFruitSort(Sfs);

        Random rm=new Random();
        for(int i=0;i<10;i++){
            int weight=rm.nextInt(10);
            Bfs.sendFruit(weight,"橙子");
        }
        Bfs.getFruitBox();
        Mfs.getFruitBox();
        Sfs.getFruitBox();
    }
}
