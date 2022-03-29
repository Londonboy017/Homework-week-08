package hwweek08;
import java.util.Scanner;
public class Program10 {

    public static void main (String[]args)
        {
            Scanner obj = new Scanner (System.in);
            System.out.println("Enter the number: ");
            int num = obj.nextInt();
            double sum = required_sum(num);
            //condition for armstrong number
            if (num == sum)
                System.out.println("This is an Armstrong Number");
            else
                System.out.println("This is not an Armstrong Number");
        }
        //method for digit value
        public static int noofdigits(int num)
        {
            int i;
            for ( i = 0; num > 0; i++)
                num /= 10;
            return i;
        }
        //method for sum calculation
        public static double required_sum(int num)
        {
            int i = noofdigits(num);
            double sum = 0;
            while (num > 0)
            {
                int digit = num % 10;
                num/=10;
                sum += Math.pow(digit,i);
            }
            return sum;
        }
}
