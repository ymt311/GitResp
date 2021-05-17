package cmdorder;

public class airCleaner extends Device{
    @Override
    public void close() {
        System.out.println("空调关闭");

    }

    @Override
    public void open() {
        System.out.println("空调开启");
    }
}
