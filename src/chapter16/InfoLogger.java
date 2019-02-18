package chapter16;

public class InfoLogger extends AbstractLogger {
    
    public InfoLogger() {
        this.level = 2;
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level >= level) {
            System.out.println("INFO:" + message);
        }
    }

}
