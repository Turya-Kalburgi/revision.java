import java.util.Scanner;

public class Miles{
    public static void main(String[] args){

        System.out.println("enter your km:");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 0.621;
        System.out.println("You have travelled " + miles +" miles.");
        sc.close();
   
    }
}
