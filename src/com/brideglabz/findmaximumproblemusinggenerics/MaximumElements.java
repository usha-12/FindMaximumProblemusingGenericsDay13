package com.brideglabz.findmaximumproblemusinggenerics;

public class MaximumElements {
    public static void main(String[] args) {
        System.out.println("Welcome to the Find Maximum Problem using Generics");
        System.out.println("Test Maximum of 3 Variables \n");
        Integer firstNumber = 10;
        Integer secondNumber = 20;
        Integer thirdNumber = 30;
        findMax(firstNumber,secondNumber,thirdNumber);
    }

    public static void findMax(Integer firstNumber,Integer secondNumber,Integer thirdNumber ){
        Integer maximumNumber;
        /* TC -1.1  Given Max Number at 1st Position return the Same Number Ensure the test data has Max Number in the First position*/

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        /*Tc -1.2  Given Max Number at 2nd Position return the Same Number Ensure the test data has Max Number in the Second position*/
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        /*TC -1.3  Given Max Number at 3rd Position return the Same Number Ensure the test data has Max Number in the Third position*/
        else {
            maximumNumber = thirdNumber;
        }
        System.out.println(maximumNumber + " is maximum out of "+firstNumber+", "+secondNumber+" and "+thirdNumber);
    }
}
/*Given 3 Integers find
the maximum
- Ensure to test code with the Test Case.
- To ensure your Code works you need 3
test cases with Max Number at 1st, 2nd
and 3rd
- Use Integer Object and compareTo
UC 1 method to test the maximum number*/
