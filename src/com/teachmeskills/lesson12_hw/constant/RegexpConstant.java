package com.teachmeskills.lesson12_hw.constant;

/**
 * Here are the regular expression constants to work for text validation
 */
public interface RegexpConstant {
    String BREAK_TEXT_PUNCTUATION_MARKS_REGEX = "\\s*(\\s|,|!|\\.|\\?)\\s*";
    String SPLIT_TEXT_INTO_CHARACTER_FROM_AZ_REGEXP = "\\b[A-Z]{2,6}\\b";
    String PHONE_NUMBER_REGEXP = "\\+\\(\\d{2}\\)\\d{7}";
    String DOC_NUMBER_REGEXP = "\\d{4}-\\d{4}-\\d{2}";
    String EMAIL_REGEXP = "([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z]{2,3})";

}
