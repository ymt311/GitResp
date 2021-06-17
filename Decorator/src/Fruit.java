public class Fruit extends Decorating{
    public Fruit(IBirthdayCake birthdayCake){
        super(birthdayCake);
    }
    public void PutFruit(){
        System.out.println("Add Fruit......");
    }
}
