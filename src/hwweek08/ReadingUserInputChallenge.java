package hwweek08;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        m1();//static method calling in main method
    }
    //static method for sum of 10 input numbers
    public static void m1() {
        Scanner obj = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean num = obj.hasNextInt();
            if (num) {
                int number = obj.nextInt();
                sum = sum + number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            obj.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        obj.close();//close the scanner
    }


}
