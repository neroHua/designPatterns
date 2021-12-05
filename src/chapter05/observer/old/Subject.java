package chapter05.observer.old;

public interface Subject {
    
    public void attachObserver(Observer observer);

    public void detachObserver(Observer observer);
    
    public void notifyAllObserver();

}
