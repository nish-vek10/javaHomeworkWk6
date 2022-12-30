package week6_Homework;
import java.util.Scanner;

public class Task8_TempOfFahrenheit {
/*
        8.  Write a program to insert any temperature value in degree Celsius and
            convert to degree Fahrenheit ((F − 32) × 5/9 = 0°C).
 */

    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create scanner object
        System.out.print("Enter Temperature in degree Celsius: "); //print statement
        double C = sc.nextDouble(); //declare local variable for input
        double F = ((9*C)/5 + 32); //declare local variable for conversion
        //print answer to 2 decimal places
        System.out.println("Temperature in degree Fahrenheit = " + String.format("%.2f", F));
    }
}
