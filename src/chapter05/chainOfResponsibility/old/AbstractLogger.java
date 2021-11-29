package chapter05.chainOfResponsibility.old;

public abstract class AbstractLogger {

    int level;
    
    public abstract void logMessage(int level, String message);

}
