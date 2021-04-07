package logFactory;

public class ConsoleLogFactory implements LogFactory{
    public Log createLog(){
        System.out.println("控制台日志工厂生产控制台日志。");
        return new ConsoleLog();
    }
}
