package hwweek08;

public class Program05 {

public static boolean isPalindrome (int number) {

    int reverse = 0;
    int num = number;
    while (num != 0) {

        int lastDigit = num % 10;
        reverse = reverse * 10 + lastDigit;
        num /= 10;
    }
    if (number == reverse) {
        System.out.println(number + " is Palindrome.");
    } else {

        System.out.println(number + " is  not Palindrome.");
    }
    return false;
}
    public static void main(String[] args) {
isPalindrome(-122321);//calling method
isPalindrome(123321);//calling method
isPalindrome(8);//calling method

    }
}
