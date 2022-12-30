package week6_Homework;

public class Task1_Java {
/*
         1. Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print statement.
            1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and Run the programme.
 */

    //declare instance variables
    String str = "My name is Khan!";
    int x = 21;

    //declare instance method
    void display(){
        Task1_Java obj = new Task1_Java(); //create object
        System.out.println(obj.str); //print statement
        System.out.println(obj.x); //print statement
    }

    //Main method
    public static void main(String[] args) {
        Task1_Java t = new Task1_Java(); //create object
        t.display(); //call instance method using object name
    }
}
