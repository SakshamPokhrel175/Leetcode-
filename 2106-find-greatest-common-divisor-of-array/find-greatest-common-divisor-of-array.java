class Solution {
    public int findGCD(int[] nums) {
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

//         System.out.println("Sorted Array:");
// for (int i = 0; i < nums.length; i++) { // Use nums.length instead of nums.length - 1
//     System.out.println(nums[i]);
// }
// System.out.println();


        int a = nums[0];
        int b= nums[nums.length-1];
        return gcd(a,b);
        
    }

    private int gcd(int a , int b){
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }

        return a;
    }
}