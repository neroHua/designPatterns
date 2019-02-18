package chapter16;

public abstract class AbstractLogger {

    int level;
    
    public abstract void logMessage(int level, String message);

}
