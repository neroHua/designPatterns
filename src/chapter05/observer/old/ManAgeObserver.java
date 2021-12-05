package chapter05.observer.old;

public class ManAgeObserver implements Observer {
    
    int age;
    
    @Override
    public void udpate(Subject subject) {
        Man man = (Man)subject;
        this.age = man.age;
        
        System.out.println("age: " + age);
    }

}
