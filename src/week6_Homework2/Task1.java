package week6_Homework2;

public class Task1 {
/*
        1. Write a Java program to print your name on screen and then print your surname on a separate line.
*/

    //Main method
    public static void main(String[] args) {
        String name = "Anish Vekaria"; //declare local string variable
        System.out.println(name); //print
        System.out.println("Last Name: " + name.substring(6)); //print surname only
    }
}
