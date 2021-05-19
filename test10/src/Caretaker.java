import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    Map<String,Memento> mementos = new HashMap<>();

    public void addMemento(String key, Memento memento){
        mementos.put(key,memento);
    }

    public Memento getMemento(String key){
        return mementos.get(key);
    }

}
