package week6_Homework;

public class Task18_Calculations {
/*
    18. Write a Java program to print the sum (addition), multiply, subtract, divide and
        remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
*/

    public static void main(String[] args) { //Main method
        m3(); //call static method
        addition(125,24); //call static method directly
        subtraction(125,24); //call static method directly
        m1(); //call static method
        m2(); //call static method
    }

    //No return type with parameters
    static void addition(int x, int y){
        int sum = x+y; //declare local variable
        System.out.println(x + " + " + y + " = " + sum); //print statement
    }

    //No return type with parameters
    static void subtraction(int x, int y){
        int diff = x-y; //declare local variable
        System.out.println(x + " - " + y + " = " + diff); //print statement
    }

    //declare static method
    static void m1() {
        int x = 125, y = 24; //declare instance variables
        int prdt = x * y; //multiplication
        int div = x / y; //division
        System.out.println(x + " x " + y + " = " + prdt);
        System.out.println(x + " / " + y + " = " + div);
    }

    //declare static method
    static void m2(){
        int x = 125, y = 24; //declare local variables
        int mod = x%y; //modulus or remainder
        System.out.println(x + " mod " + y + " = " + mod); //print statement
    }

    //declare public method
    static void m3(){
        String str = "Expected Output:"; //declare local variable
        System.out.println(str); //print statement
    }
}
