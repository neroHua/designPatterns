package chapter16;

public class DebugLogger extends AbstractLogger {
    
    public DebugLogger() {
        this.level = 1;
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level >= level) {
            System.out.println("DEBUG:" + message);
        }
    }

}
