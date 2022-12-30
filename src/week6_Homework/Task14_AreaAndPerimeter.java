package week6_Homework;

public class Task14_AreaAndPerimeter {
/*
        14. Write a Java program to print the area and perimeter of a rectangle.
            Test Data:
            Width = 5.5 Height = 8.5

            Expected Output:
            Area is 5.6 * 8.5 = 47.60
            Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

    //Main method
    public static void main(String[] args) {
        display(); //call method
    }
    //create static method
    static void display(){
        double w = 5.6, h = 8.5; //declare local variables
        double area = w*h; //area formula
        double perimeter = 2*(w+h); //perimeter formula
        System.out.println("Expected Output: "); //print statement
        System.out.println("Area is " + w + " * " + h + " = " + String.format("%.2f",area)); //print area
        System.out.println("Perimeter is " + "2 * " + "(" + w + " + " + h + ")" + " = " + String.format("%.2f",perimeter)); //print perimeter
    }
}
