import java.util.Random;

public class Client {
    public static void main(String args[]){
        Random rm=new Random();
        PieceFactory pfactory=new PieceFactory();
        for(int i=0;i<19;i++)
            for(int j=0;j<19;j++){
                Apiece p;
                if(rm.nextInt()%2==0)
                    p=pfactory.GetPiece("白棋");
                else
                    p=pfactory.GetPiece("黑棋");
                p.play(rm.nextInt(19),rm.nextInt(19));
            }
        System.out.println("总共棋子对象个数是："+pfactory.GetPieceCount());
    }
}
