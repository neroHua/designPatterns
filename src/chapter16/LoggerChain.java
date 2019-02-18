package chapter16;

import java.util.List;

public class LoggerChain extends AbstractLogger {
    
    List<AbstractLogger> loggerList;

    public LoggerChain(List<AbstractLogger> loggerList) {
        this.loggerList = loggerList;
    }

    @Override
    public void logMessage(int level, String message) {
        for (AbstractLogger logger : loggerList) {
            logger.logMessage(level, message);
        }
    }

}
