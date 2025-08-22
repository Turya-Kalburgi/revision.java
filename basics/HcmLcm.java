package basics;
import java.util.*;

public class HcmLcm {
    public static void main(String main[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b =sc.nextInt();

        int x =a; int y = b;

        while (b!= 0){
            int temp =b;
            b = a%b;
            a = temp;
        }

        int hcf = a;
        int lcm = (x * y) / hcf;

        System.out.println("HCF is:"+ x +"and"+y+"="+ hcf);
        System.out.println("LCM is:"+ x +"and"+y+"="+ lcm);
        sc.close();
    }
}
