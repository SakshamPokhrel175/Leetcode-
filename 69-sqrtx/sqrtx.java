class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        
        // i * i may overflow for large x, so use long for multiplication
        for (int i = 0; i <= x; i++) {
            if ((long)i * i <= x) {
                ans = i;
            } else {
                break;
            }
        }
        
        return ans;
    }
}
