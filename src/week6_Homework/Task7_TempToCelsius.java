package week6_Homework;
import java.util.Scanner;

public class Task7_TempToCelsius {
/*
        7.  Write a program to insert any temperature value in degree Fahrenheit and
            convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create scanner object
        System.out.print("Enter Temperature in degree Fahrenheit: "); //print statement
        double F = sc.nextDouble(); //declare local variable for input
        double C = ((5*(F - 32))/9); //declare local variable for conversion
        //print answer to 2 decimal places
        System.out.println("Temperature in degree Celsius = " + String.format("%.2f", C));
    }
}