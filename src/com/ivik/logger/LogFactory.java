package com.ivik.logger;

/**
 * Created by Cardoso on 02-Feb-16.
 */
public class LogFactory {
    private static LogType logType;

    public static Logger getLogger() {
        switch (logType) {
            case SIMPLE:
                return new SimpleLogger();//if logType is SIMPLE it return the methods in class SimpleLogger
            case FANCY:
                return new FancyLogger();//if logType is FANCY it return the methods in class FancyLogger
        }
        return null;
    }

    public static void setLogger(LogType logType) {
        LogFactory.logType = logType;
    }
}

