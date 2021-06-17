public class BigFruitSort extends AbstractFruitSort{
    public BigFruitSort(int weight){
        super(weight);
    }
    protected void pushBox(String fruit){
        fruitBox.add("超市:"+fruit);  //将大水果放入超市
    }
}
