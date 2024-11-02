package com.seeyou.logging;

import org.apache.log4j.Level;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */

@SuppressWarnings("serial")
public class MyLevel extends Level {
    /**
     * Value of MyLevel level. This value is lesser than DEBUG_INT and higher
     * than TRACE_INT}
     */
    public static final int STREAM_INT = Level.INFO_INT + 1;
    public static final int DB_INT = Level.INFO_INT + 2;
    public static final int DB_NOTIFY_INT = Level.INFO_INT + 10;

    public static final int DB_ERROR_INT = Level.ERROR_INT + 1;
    public static final int SECURITY_ERROR_INT = Level.ERROR_INT + 2;

    /**
     * Level representing my log level
     */
    public static final Level STREAM = new MyLevel(STREAM_INT, "STREAM", 10);
    public static final Level DB = new MyLevel(DB_INT, "DB", 10);
    public static final Level DB_NOTIFY = new MyLevel(DB_NOTIFY_INT, "DB_NOTIFY", 10);
    public static final Level DB_ERROR = new MyLevel(DB_ERROR_INT, "DB_ERROR", 10);
    public static final Level SECURITY_ERROR = new MyLevel(SECURITY_ERROR_INT, "SECURITY_ERROR", 10);


    /**
     * Constructor
     * @param arg0
     * @param arg1
     * @param arg2
     */
    protected MyLevel(int arg0, String arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    /**
     * Checks whether logArgument is "STREAM" level. If yes then returns
     STREAM}, else calls MyLevel#toLevel(String, Level) passing
     it Level#DEBUG as the defaultLevel.
     */
    public static Level toLevel(String logArgument){
        if ((logArgument != null) && logArgument.toUpperCase().equals("STREAM")) {
            return STREAM;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("DB")){
            return DB;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("DB_NOTIFY")){
            return DB_NOTIFY;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("DB_ERROR")){
            return DB_ERROR;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("SECURITY_ERROR")) {
            return SECURITY_ERROR;
        }

        return (Level) toLevel(logArgument, Level.DEBUG);
    }

    /**
     * Checks whether val is MyLevel#STREAM_INT. If yes then
     returns MyLevel#STREAM, else calls
     MyLevel#toLevel(int, Level) passing it Level#DEBUG as the
     defaultLevel
     *
     */
    public static Level toLevel(int val){
        if (val == STREAM_INT) {
            return STREAM;
        }

        if (val == DB_INT) {
            return DB;
        }

        if (val == DB_NOTIFY_INT) {
            return DB_NOTIFY;
        }

        if (val == DB_ERROR_INT) {
            return DB_ERROR;
        }

        if (val == SECURITY_ERROR_INT) {
            return SECURITY_ERROR;
        }

        return (Level) toLevel(val,Level.DEBUG);
    }


    /**
     * Checks whether logArgument is "STREAM" level. If yes then returns
     MyLevel#STREAM, else calls
     Level#toLevel(java.lang.String, org.apache.log4j.Level)
     *
     */
    public static Level toLevel(String logArgument, Level defaultLevel ){
        if ((logArgument != null) && logArgument.toUpperCase().equals("STREAM")) {
            return STREAM;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("DB")){
            return DB;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("DB_NOTIFY")){
            return DB_NOTIFY;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("DB_ERROR")){
            return DB_ERROR;
        }

        if ((logArgument != null) && logArgument.toUpperCase().equals("SECURITY_ERROR")) {
            return SECURITY_ERROR;
        }

        return Level.toLevel(logArgument, defaultLevel);
    }

    /**
     * Checks whether val is MyLevel#STREAM_INT. If yes
     then returns MyLevel#STREAM, else calls Level#toLevel(int, org.apache.log4j.Level)
     *
     */
    public static Level toLevel(int val, Level defaultLevel){
        if (val == STREAM_INT) {
            return STREAM;
        }

        if (val == DB_INT) {
            return DB;
        }

        if (val == DB_NOTIFY_INT) {
            return DB_NOTIFY;
        }

        if (val == DB_ERROR_INT) {
            return DB_ERROR;
        }

        if (val == SECURITY_ERROR_INT) {
            return SECURITY_ERROR;
        }

        return Level.toLevel(val,defaultLevel);
    }
}
