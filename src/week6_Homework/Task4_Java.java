package week6_Homework;

public class Task4_Java {
/*
        4.  Write a Java programme using the following steps.
            4.1 Declare two instance and two static variables.
            4.2 Declare one instance method.
            4.3 Declare one static method.
            4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
            4.5 Declare the Main method.
            4.6 Call both instance and static methods into the Main method and run the programme.
*/

    //declare instance variables
    String str1 = "What is your code?";
    int x = 420;

    //declare static variables
    static String str2 = "James Bond";
    static String str3 = "007";

    //declare instance method
    void display(){
        Task4_Java obj = new Task4_Java(); //create object
        System.out.println(obj.str1); //print statement
        System.out.println(obj.x); //print statement
        System.out.println(obj.str2); //print statement
        System.out.println(obj.str3); //print statement
    }

    //declare static method
    static void m1(){
        Task4_Java t1 = new Task4_Java(); //create object
        System.out.println(t1.str1); //print statement
        System.out.println(t1.x); //print statement
        System.out.println(t1.str2); //print statement
        System.out.println(t1.str3); //print statement
    }

    //Main method
    public static void main(String[] args) {
        Task4_Java t2 = new Task4_Java(); //create object
        t2.display(); //call instance method using object name
        m1(); //call static method directly
    }
}
