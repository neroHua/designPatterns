package chapter05.state;

public class TV {
    
    TVState state;

    public void change() {
        state.doAction();
    }

    public TVState getState() {
        return state;
    }

    public void setState(TVState state) {
        this.state = state;
    }
}
