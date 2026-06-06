package dsa.easy;

class Solution {

    public boolean isPalindrome(int x) {

        if(x < 0){

            return false;

        }

        int org = x;
        int rev = 0;

        while(x > 0){

            int dig = x % 10;

            rev = rev * 10 + dig;

            x = x / 10;

        }

        if(org == rev){

            return true;

        }else{

            return false;

        }
    }

    public static void main(String[] args){

        Solution s = new Solution();

        System.out.println(s.isPalindrome(121));

    }
}