package chapter23;

/**
 * 
 * 状态模式(state)
 * 将状态的控制推到状态上
 * 
 * @author 滑德友
 * @time 2019年2月22日11:22:50
 *
 */
public class Client {

    public static void main(String[] args) {
        TV TV = new TV();
        
        TV.setState(new TVOpenState());
        TV.aliveState();
        TV.setState(new TVCloseState());
        TV.aliveState();
    }

}
