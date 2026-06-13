import java.util.*;

public class Rev {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter length of array");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter " + n + " numbers");

        for(int i=0; i<arr.length; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("the reversed array is:");

        for(int i = arr.length-1; i>=0; i--){

            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
