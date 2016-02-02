package com.ivik.logger;

/**
 * Created by Cardoso on 02-Feb-16.
 */
class SimpleLogger implements Logger {

    public void debug(String msg){
        System. out .println( "DEBUG: " + msg);
    }

    public void warn (String msg){
        System. out .println( "WARN: " + msg);

    }

    public void info(String msg){
        System. out .println( "INFO: " + msg);
    }

    public void error(String msg){
        System. out .println( "ERROR: " + msg);
    }
}
