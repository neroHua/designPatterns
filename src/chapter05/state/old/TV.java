package chapter05.state.old;

public class TV {
    
    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void aliveState() {
        state.doAction();
    }

}
