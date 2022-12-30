package week6_Homework2;

public class Task2 {
/*
        2.  Write a java program which remove extra space from both side “    I love java    ”
            Expected output: “I love java”
*/

    //Main method
    public static void main(String[] args) {
        String name = "    I love java    "; //declare local variable
        //print statement after deletion of leading and trailing spaces
        System.out.println("Expected Output: " + name.trim());
    }
}
