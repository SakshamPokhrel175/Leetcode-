class Solution {
    public String reverseWords(String s) {
        // Step 1: Reverse the whole string
        s = new StringBuilder(s).reverse().toString();
        
        int i = 0;
        //hero honge hamare l and r jo reverse karenge words ko 
        int l = 0, r = 0;

        int n = s.length();
       char[] charArray = s.toCharArray();
        
        while (i < n) {
            // Move 'i' until the end of a word or string
            while (i < n && charArray[i] != ' ') {  // 'i' ko aaghar Character dekha  to  
                                                    // 'r' ko degaa and do i++ and r++

                charArray[r] = charArray[i];
                i++;
                r++;
            }


            
            // If 'l' is less than 'r', reverse the current word
            if (l < r) {
                reverse(charArray, l, r - 1);
                if (r < n) {
                    charArray[r++] = ' ';
                }
                l = r;
            }
            
            // Move 'i' to the next character
            i++;
        }
        
        // Remove the trailing space if there is one
        if (r > 0 && charArray[r - 1] == ' ') {
            r--;
        }
        
        // Return the result as a string
        return new String(charArray, 0, r);
    }
    
    // Helper method to reverse a portion of the char array
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
