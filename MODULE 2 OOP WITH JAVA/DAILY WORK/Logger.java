package org.Assignment5;

public class Logger {
    // Static variable to hold the single instance of Logger
    private static Logger instance;
    private StringBuilder logMessages;

    private Logger() {
        logMessages = new StringBuilder();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append("\n");
    }


    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0);
    }

    public static void main(String[] args) {
  
        Logger logger = Logger.getInstance();
        logger.log("First log message");
        logger.log("Second log message");
        
        System.out.println("Current log messages:");
        System.out.println(logger.getLog());
        
        logger.clearLog();
        
        System.out.println("Log messages after clearing:");
        System.out.println(logger.getLog());
    }
}