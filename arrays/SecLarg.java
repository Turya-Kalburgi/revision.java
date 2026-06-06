import java.util.*;

public class SecLarg {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter 5 nu.:");

        for(int i =0; i<arr.length; i++){

        arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i] > largest){

                secondLargest = largest;

                largest = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] != largest){

                secondLargest = arr[i];
            }
        }
        System.out.println("the largest is " + largest);
        System.out.println("the Second largest is " + secondLargest);
        sc.close();

    }
}
