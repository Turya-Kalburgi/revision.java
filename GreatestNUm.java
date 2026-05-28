import java.util.*;

public class GreatestNUm {

    public static void main(String [] args){

        System.out.println("Enter 3 num");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a > b && a > c){

            System.out.println(a + " is the greatest");
        }else if(b > a && b> c){

            System.out.println(b + " is the greatest");
        }else{

            System.out.println(c + " is the greatest");
        }
        sc.close();

    }
}
