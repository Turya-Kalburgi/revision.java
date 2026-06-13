import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        //initialize HashMap
        HashMap<Integer, Integer> seen = new HashMap<>();

        //visit each node
        for(int i=0; i<nums.length; i++){

            //current number
            int num = nums[i];

            //number need to reach the target
            int complement = target - num;

            //have you seen the number before??
            if(seen.containsKey(complement)){

                //return old index and current index
                return new int[]{seen.get(complement),i};

            }
            //store it 
                seen.put(num,i);

        }
        //no answer found
        return new int[]{};
    
}
public static void main(String[] args){

    //input array
    int[] nums = {2,7,11,15};
    
    //TARGET SUM
    int target = 9;

    //calL function
    int[] answer = twoSum(nums, target);

    //print answer
    System.out.println(answer[0] + ", " + answer[1]);
}
}
