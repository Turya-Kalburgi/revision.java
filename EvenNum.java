import java.util.*;

public class EvenNum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("the number is Even");
        }else{
            System.out.println("the number is odd");
        }
        sc.close();
    }
    
}
