import java.util.*;

public class EvenOddDigits {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num");

        int num = sc.nextInt();

        int even = 0;
        int odd = 0;

        while(num > 0){

            int digit =  num % 10;

            if(digit % 2 == 0){

                even++;
            }else{

                odd++;
            }

            num = num/10;
        }
        System.out.println("even no.: " + even);
        System.out.println("odd no.: " + odd);
        sc.close();
    }


    
}
