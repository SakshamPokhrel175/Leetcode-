class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=0;
        int max_diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){

            int left=i+1;
            int right=nums.length-1;
            

            while(left<right){
                int sum=nums[i] +nums[left] +nums[right];
                //find how much closest to target number we get;
                
                int diff=Math.abs(sum-target);

                if(diff<max_diff){
                    max_diff=diff;
                    result=sum  ;
                }
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;
        
    }
}