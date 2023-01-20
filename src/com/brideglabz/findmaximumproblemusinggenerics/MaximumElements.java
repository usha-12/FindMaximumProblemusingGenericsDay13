package com.brideglabz.findmaximumproblemusinggenerics;

public class MaximumElements {
    public static void main(String[] args) {
        System.out.println("Welcome to the Find Maximum Problem using Generics");
        System.out.println("Test Maximum of 3 Variables \n");
        Integer firstNumber = 10;
        Integer secondNumber = 20;
        Integer thirdNumber = 30;
        Float floatNum1 = 23.1f;
        Float floatNum2 = 11.89f;
        Float floatNum3 = 5.34f;
        String string1 = "Apple";
        String string2 = "Peach";
        String string3 = "Banana";
        findMax(string1, string2, string3);
        findMax(firstNumber, secondNumber, thirdNumber);
        findMax(floatNum1, floatNum2, floatNum3);
    }
    /* TC -1.1  Given Max Number at 1st Position return the Same Number Ensure the test data has Max Number in the First position*/
    /*Tc -1.2  Given Max Number at 2nd Position return the Same Number Ensure the test data has Max Number in the Second position*/
    /*TC -1.3  Given Max Number at 3rd Position return the Same Number Ensure the test data has Max Number in the Third position*/
    public static void findMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = firstNumber;
        } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }
        System.out.println(maximumNumber + " is maximum out of " + firstNumber + ", " + secondNumber + " and " + thirdNumber);
    }
    public static void findMax(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumNumber;
        System.out.println("----------------------------------------------------------------------");
        System.out.println();

        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = firstNumber;
        } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }
        System.out.println(maximumNumber + " is maximum out of " + firstNumber + ", " + secondNumber + " and " + thirdNumber);
    }
    public static void findMax(String firstString, String secondString, String thirdString) {
        String maximumString;
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        if(firstString.compareTo(secondString)>0 && firstString.compareTo(thirdString)>0) {
            maximumString = firstString;
        }
        else if(secondString.compareTo(firstString)>0 && secondString.compareTo(thirdString)>0) {
            maximumString = secondString;
        }
        else {
            maximumString = thirdString;
        }

        System.out.println(maximumString + " is maximum out of "+firstString+", "+secondString+" and "+thirdString);
    }
}
/*Given 3 Strings find the maximum
- Ensure to test code with the Test
Case and repeat with the similar 3
Test cases in UC 1
UC 3 - E.g. Apple Peach Banana*/