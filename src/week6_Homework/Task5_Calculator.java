package week6_Homework;

public class Task5_Calculator {
/*
        5.  Write a program for a calculator with addition, subtraction, multiplication
            and division methods all with parameters and use string concatenation
            methods.(Note: Two static and Two instance methods.)
*/

    int x1 = 50, y1 = 30; //declare instance variables
    int prdt = x1 * y1; //multiplication

    int x2 = 125, y2 = 25; //declare instance variables
    int div = x2 / y2; //division

    //declare static method with parameters
    static void addition(int x, int y){
        int sum = x+y; //declare local variable
        System.out.println(x + " + " + y + " = " + sum); //print statement
    }

    //declare static method with parameters
    static void subtraction(int x, int y){
        int diff = x-y; //declare local variable
        System.out.println(x + " - " + y + " = " + diff); //print statement
    }

    //declare public method
    static void m3(){
        String str = "Output:"; //declare local variable
        System.out.println(str); //print statement
    }

    public static void main(String[] args) { //Main method
        m3(); //call static method
        addition(360,60); //call static method directly
        subtraction(190,25); //call static method directly
        Task5_Calculator obj = new Task5_Calculator(); //create object
        System.out.println(obj.x1 + " x " + obj.y1 + " = " + obj.prdt); //print statement
        System.out.println(obj.x2 + " / " + obj.y2 + " = " + obj.div); //print statement
    }
}
