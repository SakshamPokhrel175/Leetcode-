class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result= new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        while(k>=0){
            int a=nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(a>b){
                result[k]=a;
                i++;
                k--;
            }else{
                result[k]=b;
                j--;
                k--;
            }
        }
        return result;
        
    }
}