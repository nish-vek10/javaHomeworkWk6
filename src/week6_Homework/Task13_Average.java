package week6_Homework;

public class Task13_Average {
/*
        13. Write a Java program that takes three numbers as input to calculate and
            print the average of the numbers.
 */

    int x = 5, y = 3, z = 7; //declare instance variable
    int ans = (x+y+z)/3; //declare instance variable

    //Main method
    public static void main(String[] args) {
        Task13_Average obj = new Task13_Average(); //create object
        System.out.println("Input Numbers = " + obj.x + ", " + obj.y + ", " + obj.z); //print statement
        System.out.println("Average = " + obj.ans); //print statement
    }
}
