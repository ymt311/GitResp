package logFactory;

public class Client {
    public static void main(String[] args) {
        try {
            Log log;
            LogFactory factory;
            factory = (LogFactory)XMLUtil.getBean();
            log = factory.createLog();
            log.writeLog();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
