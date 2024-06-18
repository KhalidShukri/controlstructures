public class breakandcontinue {
    public static void main(String []args) {
//         break and continue
//        they are used to control flow of execution within loops.
//        1.Break statement is used to exit a loop immediately , skiipping the remaining iterations

        for (int h = 1;h<=11;h++) {
            if (h == 5){
                break;

            }
            System.out.println(h);

        }
//        2.the continue statement is used to skip the current iteration of aloop and move to the next iteration
        for (int c =1;c<=10;c++) {
            if (c == 5) {
                continue;

            }
            System.out.println(c);

        }
//        write a java program that calculates the sum of all even numbers between 1-100
        int m = 0;
        for (int n =2;n<=100;n+=2) {
            m = m+n;


        }
        System.out.println(m);

    }
}
