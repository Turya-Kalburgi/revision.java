import java.util.*;

public class MulTab {  
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number for Multiplication Table:");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " +num+ " is:");

        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }
        sc.close();
    }
}
