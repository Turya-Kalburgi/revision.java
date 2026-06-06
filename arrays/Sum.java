import java.util.*;

public class Sum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int sum =0;

        System.out.println("enter any 5 numbers");

        for(int i =0; i<arr.length; i++){

            arr[i] = sc.nextInt();

            sum = sum +arr[i];
        }
        System.out.println("The sum of numbers is " + sum);

        sc.close();
    }
    
}
