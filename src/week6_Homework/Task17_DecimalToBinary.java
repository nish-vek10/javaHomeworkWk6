package week6_Homework;

public class Task17_DecimalToBinary {
/*
        17. Write a Java program to convert a decimal number to binary number.
*/

    //declare instance method
    void decimalToBinary(){
        int i = 21; //declare local variable
        System.out.print("Binary of " + i + " is "); //print statement
        System.out.print(Integer.toBinaryString(i)); //convert to binary and print output
    }

    //Main method
    public static void main(String args[]){
        Task17_DecimalToBinary myObj = new Task17_DecimalToBinary(); //create object
        myObj.decimalToBinary(); //call instance method
    }
}
