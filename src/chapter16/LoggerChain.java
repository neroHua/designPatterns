package chapter16;

import java.util.ArrayList;
import java.util.List;

public class LoggerChain extends AbstractLogger {
    
    List<AbstractLogger> loggerList;

    public LoggerChain() {
        this.loggerList = new ArrayList<>();
        this.loggerList.add(new ErrorLogger());
        this.loggerList.add(new InfoLogger());
        this.loggerList.add(new DebugLogger());
    }

    @Override
    public void logMessage(int level, String message) {
        for (AbstractLogger logger : loggerList) {
            logger.logMessage(level, message);
        }
    }

}
