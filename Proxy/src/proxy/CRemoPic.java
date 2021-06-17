package proxy;
//真实主题角色
public class CRemoPic implements IShowPic{
    public void ShowPic(String picname){
        for(int i=0;i<3;i++){
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
