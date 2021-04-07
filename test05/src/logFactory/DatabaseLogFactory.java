package logFactory;

public class DatabaseLogFactory implements LogFactory{
    public Log createLog(){
        System.out.println("数据库日志工厂生产数据库日志。");
        return new DatabaseLog();
    }
}
