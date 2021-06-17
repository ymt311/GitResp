public class Client {
    public static void main(String a[]){
        Color color=(Color)XMLUtilPen.getBean("color");
        Pen pen=(Pen)XMLUtilPen.getBean("pen");
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
