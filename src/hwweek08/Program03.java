package hwweek08;

import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Program03 call = new Program03();
        call.letter();//call method via object
    }
//instance method
    public void letter() {
        String a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter any alphabet: ");
        a = obj.next();
        a = a.toLowerCase(Locale.ROOT);//to conver lower case
        boolean b = a.matches("[a-z,A-Z]+");//to check alphabet

        if (b == true) {
            if (a.length() == 1) {
                //Swich case for vowels
                switch (a) {
                    case "a":
                        System.out.println("vowels");
                        break;
                    case "e":
                        System.out.println("vowels");
                        break;
                    case "i":
                        System.out.println("vowels");
                        break;
                    case "o":
                        System.out.println("vowels");
                        break;
                    case "u":
                        System.out.println("vowels");
                        break;
                    default:
                        System.out.println("Consonants");
                }
            } else System.out.println("Error: Please enter letter between a and z or A and Z");
        } else System.out.println("Error: Please enter letter between a and z or A and Z");
    }
}