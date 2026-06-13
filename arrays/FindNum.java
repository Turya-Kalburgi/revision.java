import java.util.*;
public class FindNum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " number");

        for(int i=0; i<arr.length; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number to match: ");

        int target = sc.nextInt();

        boolean found = false;

        for(int i=0; i<arr.length; i++){

            if(arr[i]== target){

            System.out.println("the number is found!😀 at position " + (i + 1));    

            found = true;

                break;
            }
        }

        if(found == false){
            
            System.out.println("oohoo try again!!");
        }
        sc.close();
        }
    }



