class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }

        // return new int[]{};
        //this was O(n2)


        // int i=0;
        // int j=i+1;

        // while(j<nums.length){
        //     if(nums[i]+nums[j]==target){
        //         return new int[]{i,j};
        //     }
        //     i++;
        //     j++;
        // }
        // return new int[]{};
        //this was O()

        //HashMap

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        

        
        
    }
}