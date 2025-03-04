class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0){
            return "";
        }

        Arrays.sort(strs);
        String first=strs[0];
        String last =strs[strs.length-1];
        
        int i=0;
        int len=Math.min(first.length() , last.length());
        while(i<len && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);

           
    }
}