package week6_Homework;

public class Task6_AreaOfCircle {
/*
        6. Write a program to enter any radius value of the circle and find out the
           area.(Formula of Area A=PI*r*r).
 */

    //create static method
    static void m1 (){
        double pi = 3.142; //declare variable for the value of pi
        int r = 10; //declare value for radius
        double A = (pi*r*r); //declare variable for calculation of area of a circle
        System.out.println("Area = " + A + " area squared."); //print area
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }
}
