import java.util.*;

public class SumTillFive {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any random number");

        int num = sc.nextInt();

        int sum = 0;

        for (int i=1; i<=num; i++){

            sum = sum + i;
        }
        System.out.println("The sum is:" + sum);
         sc.close();
    }
   
}
