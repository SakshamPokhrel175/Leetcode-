class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Using TWO pointer Methods
        int i = 0;
        int j = numbers.length - 1; //-1 because , array start with 0

        while (i < j) {
            if ((numbers[i] + numbers[j]) > target) {
                j--;
            } else if ((numbers[i] + numbers[j]) < target) {
                i++;
            } else {
                //numbers[i]+numbers[j]==target
                return new int[] { i + 1, j + 1 }; //why we done +1, because index stated with 1, as in questions so 
            }
        }

        return new int[] {};

    }
}