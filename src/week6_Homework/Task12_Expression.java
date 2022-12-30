package week6_Homework;

public class Task12_Expression {
/*
        12. Write a Java program to compute the specified expressions and print the output.
            Test Data:
            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
            Expected Output : 2.138888888888889
 */

    public static void main(String[] args) { //Main Method
        m1(); //call method
    }

    //declare static method
    static void m1 () {
        double ans = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); //declare variables
        System.out.println("Expected Output: "); //printing the specified text
        System.out.println(String.format("%.15f", ans)); //setting the precision to 15 decimal places
    }
}

