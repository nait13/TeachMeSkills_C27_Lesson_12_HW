package com.teachmeskills.lesson12_hw.task2;

import com.teachmeskills.lesson12_hw.constant.RegexpConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *The "extractInformationFromText" method accepts the text, finds in it the email document number and phone number
 */
public class Task2 {
    public static void extractInformationFromText(String string) {
        Pattern docNumber = Pattern.compile(RegexpConstant.DOC_NUMBER_REGEXP);
        Pattern email = Pattern.compile(RegexpConstant.EMAIL_REGEXP, Pattern.CASE_INSENSITIVE);
        Pattern telNumber = Pattern.compile(RegexpConstant.PHONE_NUMBER_REGEXP);

        Matcher docMatcher = docNumber.matcher(string);
        Matcher emailMatcher = email.matcher(string);
        Matcher telNumberMatcher = telNumber.matcher(string);


        System.out.println(emailMatcher.find() ?
                "Email: " + emailMatcher.group() :
                "Email not found!"
        );
        System.out.println(telNumberMatcher.find() ?
                "Phone number: : " + telNumberMatcher.group() :
                "Phone number: not found!"
        );

        while (docMatcher.find()) System.out.println("document number: " + docMatcher.group());
    }
}
