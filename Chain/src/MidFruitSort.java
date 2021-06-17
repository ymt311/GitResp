public class MidFruitSort extends AbstractFruitSort{
    public MidFruitSort(int weight){
        super(weight);
    }
    protected void pushBox(String fruit){
        fruitBox.add("水果罐头:"+fruit);  //将中等大小水果做成罐头
    }
}
