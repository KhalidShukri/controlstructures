public class loops {
    public static void main(String []args) {
//     loops
//        for loops
//        The for loop is used to execute a block of code repeatedly for a specific number of iterations

//        for (initialization;condition;iteration) {
//            code to execute goes here
//        }
//        example:Create a program that outputs integers 1-10
        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }
//        otuput 0,5,10...30
        for (int x = 0;x<=30;x+=5) {
            System.out.println(x);
        }

//        while and do while loop
//        while loop used to execute a block of code repeatedly as long as a given condition is true
//        while (condition) {
//            code to execute if condition is true
//        }
//        output 1-10
        int y = 1;
        while(y<=10) {
            System.out.println(y);
            y++;
        }
//        output 0,5,20...30
   int t = 0;
        while (t<=30) {
            System.out.println(t);
            t+=5;
        }
//        do...while
//        is a variation of the while loop but the main difference is the do-while executes the loop body atleast once, even if the condition is false
//        do {
//            code to execute
//        } while (condition)
//        output 1=10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
//        output 0,5,10...30
        int b = 0;
        do {
            System.out.println(b);
            b+=5;
        } while (b<=30);
    }
}
