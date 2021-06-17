public class Decorating implements IBirthdayCake{

    private IBirthdayCake birthdayCake;
    public Decorating(IBirthdayCake birthdayCake){
        this.birthdayCake=birthdayCake;
    }

    public void show(){
        birthdayCake.show();
    }
}
