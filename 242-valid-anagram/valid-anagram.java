class Solution {
    public boolean isAnagram(String s, String t) {

     char[] sString = s.toCharArray();
     char[] tString=t.toCharArray();

     Arrays.sort(sString);
     Arrays.sort(tString);

     return Arrays.equals(sString,tString);   
    }
}