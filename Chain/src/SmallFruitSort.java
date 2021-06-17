public class SmallFruitSort extends AbstractFruitSort{
    public SmallFruitSort(int weight){
        super(weight);
    }
    protected void pushBox(String fruit){
        fruitBox.add("果汁:"+fruit);  //将小水果做成果汁
    }
}
