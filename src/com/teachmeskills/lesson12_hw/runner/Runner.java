package com.teachmeskills.lesson12_hw.runner;

import java.util.Scanner;

import static com.teachmeskills.lesson12_hw.task1.Task1.getAbbreviations;
import static com.teachmeskills.lesson12_hw.task2.Task2.extractInformationFromText;

/**
 * This class runs methods from the Task1 and Task2 class
 */
public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String userWords = scanner.nextLine();
        scanner.close();

        String testWord = "1234-5673-55, isProgrammer JAVA2023@gmail.com +(29)7735518 9999-5673-99,";
        getAbbreviations(userWords);
        extractInformationFromText(testWord);
    }
}
