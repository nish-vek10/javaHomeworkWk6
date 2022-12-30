package week6_Homework2;

public class Task3 {
    /*
        3.  Write a java program which replace a “I love java” to “we love java”
            Expected output: We love java
*/

    //Main method
    public static void main(String[] args) {
        String name = "I love java"; //declare local variable
        System.out.println("Old String: " + name); //print statement
        //print statement after replacement
        System.out.println("New String: " + name.replace("I","We"));
    }
}
