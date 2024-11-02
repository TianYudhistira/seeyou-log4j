package com.seeyou.logging;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.PatternParser;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */
public class MyPatternLayout extends PatternLayout {
    @Override
    protected PatternParser createPatternParser(String pattern){
        return new MyPatternParser(pattern);
    }
}
