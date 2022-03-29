package hwweek08;

public class Program08 {

    public static void main(String[] args) {
        Program08 obj = new Program08();
        obj.righttri();//calling method via object
    }

    public void righttri() {
        int i, j;
//nested for loop
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("@");
            System.out.println(" ");
        }
    }
}
