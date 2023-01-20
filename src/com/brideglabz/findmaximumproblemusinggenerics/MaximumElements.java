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
        public MaximumElements(T variable1, T variable2, T variable3, T variable4, T variable5, T variable6){
            this.variable1 = variable1;
            this.variable2 = variable2;
            this.variable3 = variable3;
            this.variable4 = variable4;
            this.variable5 = variable5;
            this.variable6 = variable6;
        }
        public void findMax(){
            MaximumElements.findMax(this.variable1, this.variable2, this.variable3, this.variable4, this.variable5, this.variable6 );
        }

        public static void main(String[] args) {
            System.out.println("Test Maximum of 3 Variables \n");
            Integer firstNumber = 10;
            Integer secondNumber = 20;
            Integer thirdNumber = 30;
            Integer fourthNumber = 99;
            Integer fiveNumber = 47;
            Integer sixNumber = 11;
            Float floatNum1 = 23.1f;
            Float floatNum2 = 11.89f;
            Float floatNum3 = 5.34f;
            Float floatNum4 = 0.4213f;
            Float floatNum5 = 65.983f;
            Float floatNum6 = 7.892f;
            String string1 = "Apple";
            String string2 = "Peach";
            String string3 = "Banana";
            String string4 = "Giraffe";
            String string5 = "Yak";
            String string6 = "Deer";
            findMax(string1, string2, string3, string4, string5, string6);
            findMax(firstNumber, secondNumber, thirdNumber,fourthNumber, fiveNumber, sixNumber);
            findMax(floatNum1, floatNum2, floatNum3, floatNum4, floatNum5, floatNum6);
        }

        /* TC -1.1  Given Max Number at 1st Position return the Same Number Ensure the test data has Max Number in the First position*/
        /*Tc -1.2  Given Max Number at 2nd Position return the Same Number Ensure the test data has Max Number in the Second position*/
        /*TC -1.3  Given Max Number at 3rd Position return the Same Number Ensure the test data has Max Number in the Third position*/
        public static<E extends Comparable<E>> void findMax(E firstVariable, E secondVariable, E thirdVariable, E fourthVariable, E fiveVariable, E sixVariable) {
            E maximumVariable;
            ArrayList<E> variableList = new ArrayList<>();
            variableList.add(firstVariable);
            variableList.add(secondVariable);
            variableList.add(thirdVariable);
            variableList.add(fourthVariable);
            variableList.add(fiveVariable);
            variableList.add(sixVariable);
            System.out.println();
            System.out.println(Collections.max(variableList) + " = is the maximum out of " + variableList);

        }
    }
/*Extend the max method to take more than three parameters*/