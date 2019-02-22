package chapter22;

import java.util.List;

public class Man implements Subject {
    
    private List<Observer> observerList;
    
    String name;
    int age;
    
    public Man(String name, int age, List<Observer> observerList) {
        this.name = name;
        this.age = age;
        this.observerList = observerList;
    }
    
    public void updateName(String name) {
        this.name = name;
    }

    public void updateAge(int age) {
        this.age = age;
    }

    @Override
    public void attachObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.udpate(this);
        }
    }

}
