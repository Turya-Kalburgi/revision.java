package basics;
import java.util.*;

public class MulTeb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking number
        System.out.println("Enter a number for vreating multiplication tabl:");
        int num = sc.nextInt();

        //printing multiplication table
        System.out.println("Multiplication table is:");

        for(int i=1; i<=10; i++){
            System.out.println(num + "x" + i + " = " +(num * i));
        }

    }

    
}
