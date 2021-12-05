package chapter05.observer.old;

public class ManNameObserver implements Observer {
    
    String name;
    
    @Override
    public void udpate(Subject subject) {
        Man man = (Man)subject;
        this.name = man.name;

        System.out.println("name: " + name);
    }

}
