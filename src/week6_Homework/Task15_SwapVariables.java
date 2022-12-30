package week6_Homework;

public class Task15_SwapVariables {
/*
        15. Write a Java program to swap two variables.
*/

    //declare static method
    static void m1() {
        int x = 25, y = 420; //declare local variables

        //print statements
        System.out.print("Before Swap: ");
        System.out.print("x = " + x + ",");
        System.out.print(" y = " + y);
        System.out.println(); //skip to new line

        int temp = x; //declare temporary local variable
        x = y; y = temp; //swap variables

        //print statements
        System.out.print("After swap: ");
        System.out.print("x = " + x + ",");
        System.out.print(" y = " + y);
    }

    //Main method
    public static void main(String[] args){
        m1(); //call method
    }
}
