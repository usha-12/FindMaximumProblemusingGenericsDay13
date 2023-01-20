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
        System.out.println("Test Maximum of 3 variables\n");

        Integer int1 = 10;
        Integer int2 = 20;
        Integer int3 = 30;
        Integer int4 = 99;
        Integer int5 = 47;
        Integer int6 = 11;
        Float floatNum1 = 23.2f;
        Float floatNum2 = 11.3f;
        Float floatNum3 = 5.5f;
        Float floatNum4 = 0.4213f;
        Float floatNum5 = 65.983f;
        Float floatNum6 = 7.892f;
        String string1 = "Leopard";
        String string2 = "Zebra";
        String string3 = "Chimpanzee";
        String string4 = "Giraffe";
        String string5 = "Yak";
        String string6 = "Deer";

        findMax(int1, int2, int3, int4, int5, int6);
        findMax(floatNum1, floatNum2, floatNum3, floatNum4, floatNum5, floatNum6);
        findMax(string1, string2, string3, string4, string5, string6);
    }

    public static <E extends Comparable<E>> void findMax(E firstVariable, E secondVariable, E thirdVariable, E fourthVariable, E fifthVariable, E sixthVariable) {
        ArrayList<E> variableList = new ArrayList<>();

        variableList.add(firstVariable);
        variableList.add(secondVariable);
        variableList.add(thirdVariable);
        variableList.add(fourthVariable);
        variableList.add(fifthVariable);
        variableList.add(sixthVariable);

        printMax(Collections.max(variableList) , variableList);
    }

}
/*Extend the max
method to also print
the max to std out
using Generic Method - Write printMax Generic Method which is
 internally called from testMaximum*/