import java.util.*;

public class SumTwoNum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter your second number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        sc.close();
        
        

    }
}