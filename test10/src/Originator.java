public class Originator {
    private State state;

    public Originator(){
        this.state = new State();
        state.setVersion(0);
    }

    public Memento createMemento(){
        State newState = null;
        try {
            newState = (State)state.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new Memento(newState);
    }

    public void showState(){
        System.out.println(" version:" + state.getVersion());
    }

    public void addVersion(){
        this.state.setVersion(this.state.getVersion() + 1);
    }

    public void readMemento(Memento memento){
        this.state = memento.getState();
    }
}
