package hwweek08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DigitSumChallenge<sum> {

    public static void main(String[] args) {
        //calling  static method to print sum of digits
        System.out.println("The sum of digits: "+sumDigits(125));
        System.out.println("The sum of digits: "+sumDigits(4));
        System.out.println("The sum of digits: "+sumDigits(-9));
        System.out.println("The sum of digits: "+sumDigits(12345));
    }
    public static int sumDigits(int number) {

        int sum = 0;
        if(number>=10){
       //while loop continue till number will be 0
        while (number >0) {
                sum = sum + number % 10;// last digit
                number = number / 10;//first
        }
        return sum;

    }
        return -1;
    }
}
