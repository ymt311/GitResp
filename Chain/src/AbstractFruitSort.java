import java.util.ArrayList;
import java.util.List;
//根据重量分拣水果（抽象处理者）
public abstract class AbstractFruitSort {
    private int weight;
    protected List<String> fruitBox ;
    private AbstractFruitSort nextFruitSort;
    public void getFruitBox(){
        System.out.println("Weight:"+weight);
        System.out.println("个数:"+fruitBox.size());
        for(String t:fruitBox){
            System.out.println(t);
        }
        System.out.println(" ");
    }
    public AbstractFruitSort(int weight){
        this.weight=weight;
        fruitBox=new ArrayList<String>();
    }
    public void setNextFruitSort(AbstractFruitSort nextFruitSort){
        this.nextFruitSort=nextFruitSort;
    }
    public void sendFruit(int weight,String fruit){
        if(this.weight<=weight)   //如果传入重量和当前重量相同，则倒入盒子中
            pushBox(fruit);
        else                      //否则放入下一个中
            if(nextFruitSort!=null){
                nextFruitSort.sendFruit(weight,fruit);
            }
    }
     protected abstract void pushBox(String fruit);
}
