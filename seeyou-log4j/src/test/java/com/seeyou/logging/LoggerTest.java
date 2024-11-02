package com.seeyou.logging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */
public class LoggerTest {
    public static final Logger logger = LogManager.getLogger(LoggerTest.class);

    public LoggerTest(){

    }

    @Test
    public void testMethod(){
        logger.error("TEST ERROR" + "${java:version}");
    }

    
}
