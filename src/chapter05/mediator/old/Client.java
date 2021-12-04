package chapter05.mediator.old;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 中介者模式(mediator)
 * 可以对象间的调用关系网变得简单
 * 
 * @author 滑德友
 * @time 2019年2月21日17:41:21
 *
 */
public class Client {

    public static void main(String[] args) {
        MarriageMediator marriageMediator = new MarriageMediatorImpl(); 

        List<Human> humanList = new ArrayList<>();
        Man man1 = new Man(marriageMediator, 1);
        Man man2 = new Man(marriageMediator, 2);
        Man man3 = new Man(marriageMediator, 3);
        WoMan woman1 = new WoMan(marriageMediator, 1);
        WoMan woman2 = new WoMan(marriageMediator, 2);
        WoMan woman3 = new WoMan(marriageMediator, 3);
        humanList.add(man1);
        humanList.add(man2);
        humanList.add(man3);
        humanList.add(woman1);
        humanList.add(woman2);
        humanList.add(woman3);
        marriageMediator.setHumanList(humanList);
        
        System.out.println(man1.findMarriage(3));
    }

}
