package week6_Homework;

public class Task2_Java {
/*
        2.  Write a Java programme using the following steps.
            2.1 Declare two static variables
            2.2 Declare one static method
            2.3 Call both static variables into the static method inside the print statement.
            2.4 Declare the Main method.
            2.5 Call the static method into the Main method and Run the programme.
*/

    //declare static variables
    static String str = "You only live once!";
    static boolean x = true;

    //declare static method
    static void m1(){
        Task2_Java obj = new Task2_Java(); //create object
        System.out.println(obj.str); //print statement
        System.out.println(obj.x); //print statement
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method directly
    }
}
