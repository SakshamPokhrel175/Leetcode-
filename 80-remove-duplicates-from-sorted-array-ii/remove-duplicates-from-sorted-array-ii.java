class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int[] m=new int[n];
        int i=0,j=2;
        int k=1;
        while(j<n){
            if(nums[j]!=nums[i]){
                nums[i+2]=nums[j];
                i++;
                k++;
            }
            j++;
        }
        return i+2;
       
        
    }
}