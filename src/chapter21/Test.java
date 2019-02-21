package chapter21;

/**
 * 
 * 备忘录模式 
 * 存储数据的状态，需要时取出
 * 
 * @author 滑德友
 * @time 2019年2月21日19:40:13
 *
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        StateTaker stateTaker = new StateTaker();

        originator.setState("1");
        stateTaker.add(originator.saveStateToMemento());
        originator.setState("2");
        stateTaker.add(originator.saveStateToMemento());
   
        originator.getStateFromMemento(stateTaker.get(0));
        System.out.println("状态1： " + originator.getState());
        originator.getStateFromMemento(stateTaker.get(1));
        System.out.println("状态2: " + originator.getState());
    }

}
