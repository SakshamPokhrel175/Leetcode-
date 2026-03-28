class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] result= new int[nums.length];

        while(k>=0){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];

            if(a<b){
                result[k]=b;
                k--;
                j--;
                
            }else{
                result[k]=a;
                k--;
                i++;
                
                
            }
        }
        return result;
    }
}