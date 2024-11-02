package com.seeyou.logging;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */
public class SecurityErrorFilter extends Filter {
    @Override
    public int decide(LoggingEvent event) {
        if (event.getLevel() == MyLevel.SECURITY_ERROR) {
            return ACCEPT;
        } else {
            return DENY;
        }
    }
}
