import java.util.Stack;

public class Valid_Parentheses {

    public static boolean isValid(String s){

        //stack syntax
        Stack<Character> stack = new Stack <>();

        //initialize
        for(int i =0; i<s.length(); i++){

            //storing character
            char ch = s.charAt(i);

            //check opening brace,
            if(ch == '(' || ch == '[' || ch == '{'){

                //store/push the char in the stack
                stack.push(ch);

            }else{

                //if stack is empy, no matching pair retun false
                if(stack.isEmpty()){
                    return false;
                }

                //if pair matches then pop it!
                char top = stack.pop();

                if((ch == ')' && top != '(' ) ||
                   (ch == ']' && top != '[' ) ||
                   (ch == '}' && top != '{' )){

                    //if we did'nt find match then retun false
                    return false;

                }
            }


        }
        //ig after all say stack is empty
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        String s = "()[]{}";

        System.out.println(isValid(s));

    }
}
