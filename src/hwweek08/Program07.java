package hwweek08;

public class Program07 {

    public static int sumFirstAndLastDigit(int number) {
        int last;
        if (number >= 0) {
            last = number % 10;//last digit

            while (number >= 10) {
                number = number / 10;//first digit
            }
            int sum = number + last;
            System.out.println("first digit= " + number + " last digit= " + last + "sum : " + sum);
            return 0;
        } else
            System.out.println("-1");
        return -1;//method return
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(345);//8
        sumFirstAndLastDigit(-345);//-1
        sumFirstAndLastDigit(0);//0
        sumFirstAndLastDigit(5);//10
    }
}
