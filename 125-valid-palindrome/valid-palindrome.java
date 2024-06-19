class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        // Time complexity: O(n)
        // Space complexity: O(n)
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int start = 0;
        int end = s.length() - 1;
        
        // Check for palindrome
        // Time complexity: O(n)
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        
        return true; // Is a palindrome
    }
}
