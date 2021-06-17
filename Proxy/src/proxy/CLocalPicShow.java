package proxy;
//代理主题角色
public class CLocalPicShow implements IShowPic,Runnable{
    private IShowPic pic;
    private String picname;

    public void ShowPic(String picname){
        pic=new CRemoPic();
        this.picname=picname;
        System.out.println("准备载入图片"+picname);
        Thread th=new Thread(this); //将远程对象pic作为参数传递，在线程中调用远程对象
        th.start();
    }

    @Override
    public void run() {
        pic.ShowPic(picname);   //调用远程图片
        System.out.println(picname+"图片调用完成！");
    }
}
