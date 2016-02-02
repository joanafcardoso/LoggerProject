package com.ivik.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Cardoso on 02-Feb-16.
 */
class FancyLogger implements Logger {

    public void debug (String msg){
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + "***DEBUG***" + msg);
    }

    public void warn (String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + "***WARN***" + msg);
    }

    public void info (String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + "***INFO***" + msg);
    }

    public void error (String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + "***ERROR***" + msg);
    }
}
