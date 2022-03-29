package hwweek08;

import java.util.Scanner;

public class Program12 {
    public static void primenumber() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = obj.nextInt();
        int i, m, flag = 0;
        m = n / 2;
        //one condition if its not prime
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            //condition for prime
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }
    public static void main(String[] args) {
        primenumber();//calling method
    }
}
