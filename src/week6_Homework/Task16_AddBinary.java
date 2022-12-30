package week6_Homework;

public class Task16_AddBinary {
/*
        16. Write a Java program to add two binary numbers.

            Input Data:
            Input first binary number: 10
            Input second binary number: 11

            Expected Output:
            Sum of two binary numbers: 101
*/

    //declare static method
    static void m1(){
        String binaryString1 = "10"; //declare binary string
        String binaryString2 = "11"; //declare binary string
        int dec1 = Integer.parseInt(binaryString1,2); //convert binary string to decimal
        int dec2 = Integer.parseInt(binaryString2,2); //convert binary string to decimal
        int sum = dec1+dec2; //add the converted decimals
        String ans = Integer.toBinaryString(sum); //convert the sum back to binary
        System.out.println("Binary numbers: " + binaryString1 + " and " + binaryString2); //print statement
        System.out.println("Sum of two binary numbers = " + ans); //print out answer in binary
    }

    //Main method
    public static void main(String args[]){
        m1(); //call static method
    }
}
