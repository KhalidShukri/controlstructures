import java.util.Scanner;

public class switchstatements {
    public static void main (String[]args){
//        Switch Statements
//        used to execute blocks of code based on different values and expressions
//        switch (switch (variable) {
//            case label1:
//                do something if switch variable is equal to label1
//                    break;
//            case label2:
//                do something if switch variable is equal to label2
//                break;
//            case label3:
//                do something if switch variable is equal to label3
//                break;
//            default:
//                do somthinn if all cases dont match
//
//        }
        String favColor = "green";
        switch (favColor) {
            case "red":
                System.out.println("Your Favourite Color is Red");
                break;
            case "green":
                System.out.println("Your Favourite Color is Green");
                break;
            case "blue":
                System.out.println("Your Favourite Color is Blue");
                break;
            default:
                System.out.println("We don't know you Favourite Color");
        }

//        java program that checks the day of the week
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week");
        String day = scanner.nextLine();
        switch (day) {
            case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "thursday":
                System.out.println("Today is Thursday");
                break;
            case "friday":
                System.out.println("Today is Friday");
                break;
            case "saturday":
                System.out.println("Today is Saturday");
                break;
            case "sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("That is no a day of the week");
        }
        scanner.close();
    }
}
