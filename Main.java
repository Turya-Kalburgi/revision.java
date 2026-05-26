import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== Java Programs Menu ===");
        System.out.println("1. Hello World");
        System.out.println("2. Check Integer Input");
        System.out.println("3. KM to Miles Converter");
        System.out.println("4. Leap Year Checker");
        System.out.println("5. Multiplication Table");
        System.out.println("6. Sum Two Numbers");
        System.out.println("Enter your choice (1-6): ");
        
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                helloWorld();
                break;
            case 2:
                checkInteger();
                break;
            case 3:
                milesConverter();
                break;
            case 4:
                leapYearChecker();
                break;
            case 5:
                multiplicationTable();
                break;
            case 6:
                sumTwoNumbers();
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
    
    static void helloWorld() {
        System.out.println("HelloWorld");
    }
    
    static void checkInteger() {
        System.out.println("enter an integer:");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }
    
    static void milesConverter() {
        System.out.println("enter your km:");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 0.621;
        System.out.println("You have travelled " + miles +" miles.");
        sc.close();
    }
    
    static void leapYearChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a leap year to check:");
        int year = sc.nextInt();
        sc.close();
        
        boolean a = (year % 4 == 0);
        boolean b = (year % 100 != 0);
        boolean c = (year % 100 == 0 && year % 400 == 0);
        
        if (a && (b || c)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    
    static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for Multiplication Table:");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + " is:");
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        sc.close();
    }
    
    static void sumTwoNumbers() {
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
