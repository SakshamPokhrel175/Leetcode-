//Sum of all elememnts

class Solution {
    public int missingNumber(int[] nums) { 

        int n=nums.length;
        int sum=(n*(n+1))/2;

        for(int i=0; i<n; i++)
        {
            sum=sum-nums[i];
        }
     return sum;   
    }
}

// Complexity
// Time complexity:
// O(n)

// Space complexity:
// O(1)
