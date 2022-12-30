package week6_Homework;

public class Task3_Java {
/*
        3.  Write a Java programme using the following steps.
            3.1 Declare one instance and one static variable.
            3.2 Declare one instance method.
            3.3 Declare one static method.
            3.4 Call both instance and static variables into both instance and static methods inside the print statement.
            3.5 Declare the Main method.
            3.6 Call both instance and static methods into the Main method and run the programme.
*/

    float f = 21.444566f; //declare instance variable
    static char c = '@'; //declare static variable

    //declare instance method
    void display(){
        Task3_Java obj = new Task3_Java(); //create object
        System.out.println(obj.f); //print statement
        System.out.println(obj.c); //print statement
    }

    //declare static method
    static void m1(){
        Task3_Java t1 = new Task3_Java(); //create object
        System.out.println(t1.c); //print statement
        System.out.println(t1.f); //print statement
    }

    //Main method
    public static void main(String[] args) {
        Task3_Java t2 = new Task3_Java(); //create object
        t2.display(); //call instance method using object name
        m1(); //call static method directly
    }
}
