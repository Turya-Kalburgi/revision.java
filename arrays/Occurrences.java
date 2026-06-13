import java.util.*;

public class Occurrences {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int count = 0;

        System.out.println("Enter 5 numbers: ");

        for(int i=0; i<arr.length; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("ENTER NO. TO SEARCH: ");

        int target = sc.nextInt();

        for(int i=0; i<arr.length; i++){

            if (arr[i] == target){

                count++;
            }
        }
        System.out.println("Occurrences of " + target + ": " + count);
        sc.close();
    }
    
}
