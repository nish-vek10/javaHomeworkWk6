package week6_Homework;

public class Task10_MultiplicationTable {
/*
        10. Write a Java program that takes a number as an input and prints its
            multiplication table up to 10.
            Test Data: Input a number: 8
            Expected Output :

            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            ... double area=math.PI
            8 x 10 = 80
 */

    //declare static method
    static void m1() {
        int x = 8; //declare local variable
        for (int i = 1; i <= 10; i++) { //for loop
            int result = x*i; //declare local variable
            System.out.println(x + " x " + i + " = " + result); //print result
        }
    }

    public static void main(String[] args) { //Main Method
        m1(); //call method
    }
}
