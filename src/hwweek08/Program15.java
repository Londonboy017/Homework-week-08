package hwweek08;

import java.util.Scanner;

public class Program15 {

    public static void main(String []args) {
        leftri();//calling method
    }
    public static void leftri() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


