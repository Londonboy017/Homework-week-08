package hwweek08;

import java.util.Scanner;
public class Program06 {
    //main method
    public static void main(String[] args) {
        triangle();//calling method
    }

    public static void triangle() {
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println(" ");
            for (j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
        }
    }
}