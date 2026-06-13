import java.util.*;

public class Leapyearcheckk{
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a leap year to check:");
        int year = sc.nextInt();

        boolean a =(year % 4 ==0);
        boolean b =(year % 100 != 0);
        boolean c =(year %100 == 0 && year % 400 ==0);

        if (a && (b || c)){
            System.out.println(year + "is a leap year");
        }
            else{
                System.out.println(year + "is not a leap year");
            }
            sc.close();
        }
        
     
}