public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n + 1)/2;
        for(int i : nums){
            sum-= i;
        }    
        return sum;
    }
}


//The line for(int i : nums) is an enhanced for loop (also known as a "foreach" loop) in Java. It iterates over each element in the array nums, assigning each element in turn to the variable i.