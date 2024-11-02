package com.seeyou.logging;

import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */
public class MyPatternConverter extends PatternConverter {
    public static boolean isProduction = false;

    @Override
    protected String convert(LoggingEvent event) {
        return isProduction ? "PRODUCTION" : "DEVELOPMENT";
    }
}
