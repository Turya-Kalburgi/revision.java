import java.util.*;

public class Lcm {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two nos.");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a,b);

        while(true){

            if(max % a == 0 && max % b == 0){

                System.out.println(max);
                break;
            }
            max++;
        }
        sc.close();

    }
    
}
