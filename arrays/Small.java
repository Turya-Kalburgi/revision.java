import java.util.*;

public class Small {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 no.");

        for(int i=0; i<arr.length; i++){

        arr[i] = sc.nextInt();

        }

        int small =arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i] < small){

                small = arr[i];
            }

        }
        System.out.println("the smallest number is: " + small);
        sc.close();
    
    }
}

    