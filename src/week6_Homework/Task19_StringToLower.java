package week6_Homework;

public class Task19_StringToLower {
/*
        19. Write a Java program to convert a given string into lowercase.
            Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
            Output: the quick brown fox jumps over the lazy dog.
 */

    String str = "Output: "; //Declare local string variable
    String txt1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."; //Declare local string variable
    String txt2 = txt1.toLowerCase();

    //declare static method
    static void m1(){
        Task19_StringToLower x = new Task19_StringToLower(); //create an object
        System.out.println(x.str + x.txt2); //print out
    }

    //Main Method
    public static void main(String[] args) {
        m1(); //call method
    }
}
