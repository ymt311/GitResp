package Transform;

public class DatabaseSource extends AbstractSource{
    public void transferBefore(){
        System.out.println("转换之前为来自数据库的数据！");
    }
}
