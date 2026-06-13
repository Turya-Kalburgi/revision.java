import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int x){

        //negative number could not get accepted
        if(x < 0){
            return false;
        }

        //save original / initialize org number the given "x"
        int org = x;

        //make a reverse int, intialize by 0
        int rev = 0;

        //reverse the string by while method
        while(x>0){
            
            //get the last digit, add new int dig
            int dig = x % 10;

            //add the digit to the last
            rev = rev * 10 + dig;

            //remove the last digit from original
            x = x /10;
        }
        //compare org to rev, if matches or not
        return org == rev;

    }
    public static void main(String[] args){

        //take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        //print result
        System.out.println(isPalindrome(num));

        sc.close();
    }
    
}
