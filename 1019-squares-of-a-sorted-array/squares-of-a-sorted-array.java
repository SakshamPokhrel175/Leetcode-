// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             //square
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);

//         return nums;
//     }
// }
//this was O(nlogn) so now we do for O(n)


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;

        while(k>=0){
            int a=nums[i]*nums[i];  //square of i value
            int b=nums[j]*nums[j]; //square of j value

            //compare
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
