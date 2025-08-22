package basics;

import java.util.*;

public class SumUntilX{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int sum = 0;

    System.out.println("Enter the numbers( x to stop):");

    while(true){
        String input = sc.next();

        if(input.equalsIgnoreCase("x")){
            break;
        }
        try{
            int num = (Integer.parseInt(input));
            sum+=num;
        }
        catch(NumberFormatException e){
            System.out.println("you have entered invalid number please check it" );
            break;
        }
    }
    System.out.println(" sum of all numbers is:"+ sum);
    sc.close();
}
}