public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.showState();
        caretaker.addMemento("version0",originator.createMemento());

        originator.addVersion();
        originator.showState();

        originator.readMemento(caretaker.getMemento("version0"));
        originator.showState();
    }
}
