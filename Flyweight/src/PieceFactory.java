import java.util.HashMap;
import java.util.Hashtable;

public class PieceFactory {
    private HashMap PiecePool=new HashMap();

    public Apiece GetPiece(String key){
        if(!PiecePool.containsKey(key)){
            Apiece p=new OnePiece(key);
            PiecePool.put(key,p);
            return p;
        }
        return (Apiece)PiecePool.get(key);
    }

    public int GetPieceCount(){
        return PiecePool.size();
    }
}

