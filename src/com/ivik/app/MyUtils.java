package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.Logger;

/**
 * Created by Cardoso on 02-Feb-16.
 */
public class MyUtils {
    static Logger logger=LogFactory.getLogger();

    public static boolean getInt(String intString){
        boolean ok=false;
        logger.info("checking string " + intString); //this applies to all arguments

        try {
            int value=Integer.parseInt(intString);//returns a decimal represented as string as an int
            ok=true;
            logger.debug("All ok ");
            logger.warn("This is an integer");
        }catch (NumberFormatException e) {
            logger.error(e.getMessage());//if not a string decimal, it returns the error message
        }
        return ok;
    }
}
