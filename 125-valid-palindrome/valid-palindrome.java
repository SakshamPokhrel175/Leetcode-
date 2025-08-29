class Solution {
    public boolean isPalindrome(String s) {
        //Two Pointer
        //1. Lowercase the string
        s = s.toLowerCase();
        // 2. Remove everything except a-z and 0-9
        s = s.replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // mismatch → not palindrome
            } // move both pointers inward
            left++;
            right--;
        }

        return true;

    }
}