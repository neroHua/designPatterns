package chapter05.state;

public class Client {

    public static void main(String[] args) {
        TV TV = new TV();
        
        TV.setState(new TVOpenState());
        TV.change();
        TV.setState(new TVCloseState());
        TV.change();
    }

}
