class Solution {
    public int maxArea(int[] height) {
        //Two pointer 

        int left = 0;
        int right = height.length - 1;
        //FIND max area 
        int max_area_of_water = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = (right - left);

            int area = h * w; //(height * width)

            max_area_of_water = Math.max(max_area_of_water, area); //max area 

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max_area_of_water;

    }
}