import java.util.*;

public class LeapYearCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to check:");
        int leapyear = sc.nextInt();

        boolean x =(leapyear % 4 == 0);
        boolean y = (leapyear % 100!= 0);
        boolean z = (leapyear % 100 == 0 && leapyear %400 == 0);
        

        if(x &&( y || z)){
            System.out.println(leapyear +"is a leap year!");
        }
        else{
            System.out.println(leapyear +"is not a leap year !");
        }
        }   
        }


    
    

