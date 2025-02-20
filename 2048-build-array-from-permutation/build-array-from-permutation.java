class Solution {
    public int[] buildArray(int[] nums) {

        /** 
        a=3,b=4,n=6
        a=a+(b%b)*n;==27
        a=a%n; ==3
        b=a/n; ==4
        
        
        */


        int n=nums.length;      
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+(nums[nums[i]]%n)*n;
        }

        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }

        return nums;



        
    }
}






/*
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }

        return ans;

        
    }
}
*/