import java.util.Scanner;


public class scannerandif {
    public static void main(String[] args) {
        //        Write a java program that checks if a number is positive,negative or 0
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + "Is a positive number");
        } else if (number < 0) {

            System.out.println(number + " Is a negative number");
        } else {

            System.out.println("The number is zero");
        }
        scanner.close();
    }



    }

