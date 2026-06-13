//sc.hasNextInt(): CHECKS IF THE NEXT INPUT IS AN INTEGER

import java.util.Scanner;

public class Integer{
    public static void main(String[] args){

        System.out.println("enter an integer:");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}