package com.teachmeskills.lesson12_hw.task1;

import com.teachmeskills.lesson12_hw.constant.RegexpConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *The "getAbbreviations" method takes text as input, finds abbreviations in it (words from 2 to 6 letters) and displays them on the screen
 */
public class Task1 {
    public static void getAbbreviations(String string) {
        String[] arr = string.split(RegexpConstant.BREAK_TEXT_PUNCTUATION_MARKS_REGEX);
        String result = String.join(" ", arr);
        Pattern pattern = Pattern.compile(RegexpConstant.SPLIT_TEXT_INTO_CHARACTER_FROM_AZ_REGEXP);
        Matcher matcher = pattern.matcher(result);
        while (matcher.find()) System.out.println(matcher.group());
    }
}
