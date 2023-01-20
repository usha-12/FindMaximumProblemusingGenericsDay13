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
    public static<E extends Comparable<E>> void findMax(E firstVariable, E secondVariable, E thirdVariable) {
        E maximumVariable;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        if (firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0) {
            maximumVariable = firstVariable;
        } else if (secondVariable.compareTo(firstVariable) > 0 && secondVariable.compareTo(thirdVariable) > 0) {
            maximumVariable = secondVariable;
        } else {
            maximumVariable = thirdVariable;
        }
        System.out.println(maximumVariable + " is maximum out of " + firstVariable + ", " + secondVariable + " and " + thirdVariable);
    }
}
/*Refactor 1
Refactor all the 3 to
One Generic Method
and find the maximum
- Ensure the Generic Type extends
Comparable
 - Make the test case work*/