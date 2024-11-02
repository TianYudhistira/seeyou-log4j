package com.seeyou.logging;

import org.apache.log4j.helpers.PatternParser;

/**
 * @author Septian Yudhistira
 * @version 1.0
 * @since 2024-11-02
 */
public class MyPatternParser extends PatternParser {
    private static final char USERNAME_CHAR = 'u';

    public MyPatternParser(String pattern) {
        super(pattern);
    }

    @Override
    protected void finalizeConverter(char c){
        switch (c){
            case USERNAME_CHAR:
                currentLiteral.setLength(0);
                addConverter(new MyPatternConverter());

                break;

            default:
                super.finalizeConverter(c);
        }
    }
}
