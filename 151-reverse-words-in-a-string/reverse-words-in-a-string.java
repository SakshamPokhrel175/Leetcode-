class Solution {
    public String reverseWords(String s) {
        // Split the input string by whitespace
        String[] words = s.trim().split("\\s+");
        
        // Initialize an empty string to store the reversed sentence
        StringBuilder reversed = new StringBuilder();
        
        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word followed by a space to the reversed string
            reversed.append(words[i]).append(" ");
        }
        
        // Convert the StringBuilder to a string and trim any extra whitespace
        return reversed.toString().trim();
    }
}
