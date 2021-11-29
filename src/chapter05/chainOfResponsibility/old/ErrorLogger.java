package chapter05.chainOfResponsibility.old;

public class ErrorLogger extends AbstractLogger {
    
    public ErrorLogger() {
        this.level = 3;
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level >= level) {
            System.out.println("ERROR:" + message);
        }
    }

}
