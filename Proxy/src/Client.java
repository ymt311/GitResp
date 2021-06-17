import proxy.CLocalPicShow;
import proxy.IShowPic;
import proxy.CRemoPic;

public class Client {
    public static void main(String args[]){
        //CLocalPicShow cls=new CLocalPicShow();
        IShowPic cls=new CLocalPicShow();
        cls.ShowPic("photo");
    }
}
