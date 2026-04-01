class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // Process s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '#') {
                sb1.append(c);
            } else if (sb1.length() > 0) {
                sb1.deleteCharAt(sb1.length() - 1);
            }
        }

        // Process t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c != '#') {
                sb2.append(c);
            } else if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }

        return sb1.toString().equals(sb2.toString());
    }
}

//this is O(n+m)











//O(n)

// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         int i = s.length() - 1;
//         int j = t.length() - 1;

//         int skipS = 0, skipT = 0;

//         while (i >= 0 || j >= 0) {

//             // process s
//             while (i >= 0) {
//                 if (s.charAt(i) == '#') {
//                     skipS++;
//                     i--;
//                 } else if (skipS > 0) {
//                     skipS--;
//                     i--;
//                 } else {
//                     break;
//                 }
//             }

//             // process t
//             while (j >= 0) {
//                 if (t.charAt(j) == '#') {
//                     skipT++;
//                     j--;
//                 } else if (skipT > 0) {
//                     skipT--;
//                     j--;
//                 } else {
//                     break;
//                 }
//             }

//             // compare characters
//             if (i >= 0 && j >= 0) {
//                 if (s.charAt(i) != t.charAt(j)) return false;
//             } else {
//                 if (i >= 0 || j >= 0) return false;
//             }

//             i--;
//             j--;
//         }

//         return true;
//     }
// }