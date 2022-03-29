package hwweek08;

public class Program09 {
    public static void main(String[] args) {
fibonacci();//calling method
    }
    public static void fibonacci() {
        int i;
        int f1=0 , f2=1, f3;
        int n = 8;
        System.out.print(f2);
        for (i = 2; i <= n; ++i) {
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;//reassign ,save value
            f2=f3;//reassign ,save value
        }
    }
}
