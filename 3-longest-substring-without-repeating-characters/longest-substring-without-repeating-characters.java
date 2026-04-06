class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // if duplicate → shrink
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // add current char
            set.add(ch);

            // update answer
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}






// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left = 0;
//         int max = 0;
//         Map<Character, Integer> map = new HashMap<>();

//         for (int right = 0; right < s.length(); right++) {
//             char ch = s.charAt(right);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);

//             while (map.get(ch) > 1) {
//                 char leftchar = s.charAt(left);
//                 map.put(leftchar, map.get(leftchar) - 1);

//                 if (map.get(leftchar) == 0) {
//                     map.remove(leftchar);
//                 }
//                 left++;

//             }

//             max = Math.max(max, right - left + 1);
//         }

//         return max;

//     }
// }