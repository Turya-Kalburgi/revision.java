import java.util.*;

public class Even {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int evencount = 0;
        int oddcount = 0;

        System.out.println("Enteer 5 numbers");

        for(int i =0; i<arr.length; i++){

        arr[i] =sc.nextInt();

        }

        System.out.print("Even numbers:" + " ");

        System.out.print("[" + " ");

        for(int i =0; i<arr.length; i++){

            if(arr[i] % 2 == 0){

                System.out.print(arr[i] + " ");
                
                evencount++;
            }
        }

        System.out.print("]");

        System.out.println();

        System.out.print("Odd numbers: " + " ");

        System.out.print("[" + " ");

        for(int i=0; i<arr.length; i++){ 

            if(arr[i] % 2 != 0){

                System.out.print( arr[i] + " ");
                
                oddcount++;
            }
        }

        System.out.print("]");

        System.out.println();

        System.out.println("even array: " +  evencount);
        System.out.println("odd array: " +  oddcount);
        
        sc.close();
    }
    
}
