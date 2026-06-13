import java.util.*;

public class Armstrong {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = sc.nextInt();

        int Original = num;

        int sum = 0;

        while(num > 0){

            int digit = num % 10;

            sum = sum + ( digit * digit * digit);

            num = num / 10;
        }

        if ( Original == sum){

            System.out.println("The num is Armstrong");
        }else{
            System.out.println("not a Armstrong num");
        }
        sc.close();

    }
    
}
