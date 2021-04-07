package logFactory;

public class DatabaseLog implements Log{
    public void writeLog(){
        System.out.println("文件日志写入中，请稍等！");
    }
}
