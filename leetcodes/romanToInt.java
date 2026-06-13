import java.util.Scanner;
public class romanToInt {

    public static int romanToInt(String s){

        //total value equals to zero
        int total = 0;

        //initialize the list
        for(int i=0; i <s.length(); i++){

            //start with the first int
            int current =  value(s.charAt(i));

            //check next exist or not
            if(i+1 < s.length()){

                //next int check
                int next = value(s.charAt(i+1));

                //smaller before bigger
                if(current < next){

                    //subtract
                    total -= current;
                }else{

                    //add for current is big
                    total += current;
                }
            }else{

                    //for last digit 
                    total +=current;
                }

            }
            //return total
            return total;
        }
        //roman to integer

        public static int value(char ch){

            switch(ch) {

                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }
            return 0;
        }
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("ENter roman to convert in integer : ");
            String s = sc.nextLine();

            System.out.println(RomanToInt(s));
            sc.close();

        }
    }
