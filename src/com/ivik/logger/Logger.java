package com.ivik.logger;

/**
 * Created by Cardoso on 02-Feb-16.
 */
public interface Logger {
    void debug(String msg);
    void warn (String msg);
    void info(String msg);
    void error(String msg);
}
