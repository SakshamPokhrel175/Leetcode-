class Solution {
    public boolean backspaceCompare(String s, String t) {
        String resultS= buildString(s);
        String resultT= buildString(t);
        return resultS.equals(resultT);
        
    }


    private String buildString(String s){
        StringBuilder temp = new StringBuilder();
        
        int i=0;
        int n=s.length();

        while(i<n){
            if(s.charAt(i)!='#'){
                temp.append(s.charAt(i));
            }else if(temp.length()>0){
                temp.deleteCharAt(temp.length()-1);
            }
            i++;
        }

        return temp.toString();
        
        
    }
}