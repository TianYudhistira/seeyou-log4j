package com.seeyou.logging;

import org.apache.log4j.Logger;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */
public class MyLogger {
    public static final Logger logger = Logger.getLogger(MyLogger.class);

    public static void stream(String stream){
        logger.log(MyLevel.STREAM, stream);
    }

    public static void db(String db){
        logger.log(MyLevel.DB, db);
    }

    public static void dbError(String dbError){
        logger.log(MyLevel.DB_ERROR, dbError);
    }

    public static void dbError(String dbError, Throwable t){
        logger.log(MyLevel.DB_ERROR, dbError, t);
    }

    public static void dbNotify(String dbNotify){
        logger.log(MyLevel.DB_NOTIFY, dbNotify);
    }

    public static void securityError(String securityError){
        logger.log(MyLevel.SECURITY_ERROR, securityError);
    }

    public static void error(String string, Throwable exception){
        logger.error(string,exception);
    }

    public static void error(String string){
        logger.error(string);
    }

    public static void info(String info){
        logger.info(info);
    }

    public static void warn(String warn){
        logger.warn(warn);
    }

    public static void debug(String debug){
        logger.debug(debug);
    }

    public static void trace(String trace){
        logger.trace(trace);
    }
}
