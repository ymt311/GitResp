package cmdorder;

public class Light extends Device{
    @Override
    public void close() {
        System.out.println("灯关了");
    }

    @Override
    public void open() {
        System.out.println("灯开了");
    }
}
