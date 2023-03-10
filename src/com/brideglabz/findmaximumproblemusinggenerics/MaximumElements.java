package com.brideglabz.findmaximumproblemusinggenerics;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElements <T extends Comparable<T>>{
    T variable1;
    T variable2;
    T variable3;
    T variable4;
    T variable5;
    T variable6;
    /* TC -1.1  Given Max Number at 1st Position return the Same Number Ensure the test data has Max Number in the First position*/
    /*Tc -1.2  Given Max Number at 2nd Position return the Same Number Ensure the test data has Max Number in the Second position*/
    /*TC -1.3  Given Max Number at 3rd Position return the Same Number Ensure the test data has Max Number in the Third position*/

    public void maximumElement(T variable1, T variable2, T variable3, T variable4, T variable5, T variable6) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
        this.variable1 = variable4;
        this.variable2 = variable5;
        this.variable3 = variable6;
    }

    public void findMax() {
        MaximumElements<T> maximumElement;
        MaximumElements.findMax(this.variable1, this.variable2, this.variable3, this.variable4, this.variable5, this.variable6);
    }

    public static <E> void printMax(E maximum, ArrayList<E> list) {
        System.out.println();
        System.out.println(maximum + " is the maximum out of =" + list);
    }

    public static void main(String[] args) {

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
            maximumVariable = secondVariable;
        } else {
            maximumVariable = thirdVariable;
        }
        System.out.println(maximumVariable + " is maximum out of " + firstVariable + ", " + secondVariable + " and " + thirdVariable);
    }
}
/*Extend the max
method to also print
the max to std out
using Generic Method - Write printMax Generic Method which is
 internally called from testMaximum*/
