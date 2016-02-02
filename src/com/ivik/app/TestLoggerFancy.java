package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.LogType;

/**
 * Created by Cardoso on 02-Feb-16.
 */
public class TestLoggerFancy {
    public static void main(String[] args) {
        LogFactory.setLogger(LogType.FANCY);
        MyUtils.getInt("10");
        MyUtils.getInt("This is a string");
    }
}
