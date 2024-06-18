import java.util.Scanner;

public class ifstatements {
    public static void main (String[] args) {
//        In java Control Flow structures are used to control the order of execution of statements based on certain conditions or loops.

//        if statement
//        if (condition) {
//            code to execute if condition is true
//
//        }

        int age = 17;
        if (age >= 18) {
            System.out.println("You Are an Adult");

        }





//        if..else... statement
//        it is used to execute a block of code conditionally, based on a boolean expression

//        if (condition) {
//
//            code to execute if condition is true
//        } else {
//
//            code to execute if condition is false
//        }
        if (age>=18) {

            System.out.println("You Are an Adult");

        } else {
            System.out.println("You Are a Minor");

        }

//        if...else if ...else
//        if (condition1) {
//            code will execute if condition1 is true
//        } else if (condition2) {
//            code will execute if condition1 is false and condition2 is true
//
//        } else {
//
//            code will execute if condition1 and condition2 are false
//
//        }
        int temp = 27;
        if (temp>23) {
            System.out.println("Too Hot");

        } else if (temp<23) {

            System.out.println("Too Cold");

        } else {

            System.out.println("Room Temperature");



        }

        //        Write a java program that checks if a number is positive,negative or 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " Is a positive number");
        } else if (number < 0) {

            System.out.println(number + " Is a negative number");
        } else {

            System.out.println("The number is 0");
        }
        scanner.close();


    }

}