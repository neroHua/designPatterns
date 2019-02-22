package chapter22;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 观察者模式
 * 被观测者，状态改变时，观察者接到通知
 * 
 * @author 滑德友
 * @time 2019年2月21日17:41:21
 *
 */
public class Test {

    public static void main(String[] args) {
        List<Observer> observerList = new ArrayList<>();
        observerList.add(new ManAgeObserver());
        observerList.add(new ManNameObserver());

        Man man = new Man("name001", 1, observerList);
        man.updateName("name002");
        man.updateAge(2);
        man.notifyAllObserver();
    }

}
