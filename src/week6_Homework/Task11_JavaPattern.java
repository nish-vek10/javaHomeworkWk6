package week6_Homework;

public class Task11_JavaPattern {
/*
        11. Write a Java program to display the following pattern.
            Sample Pattern :
            J a v v a
            J a a v v a a
                        J J aaaaa V V aaaaa
                        J J a a V a a
 */

    //declare static method
    static void m1(){
        String str = "            "; //declare string variable for the required indented space

        //print pattern
        System.out.println("Sample Pattern:");
        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println(str + "J J aaaaa V V aaaaa");
        System.out.println(str + "J J a a V a a");
    }

    public static void main(String[] args) { //Main Method
        m1(); //call method
    }
}
