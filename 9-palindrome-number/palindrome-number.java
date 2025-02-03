class Solution {
    public boolean isPalindrome(int x) {
        int orginal_value=x;
        int s=0;
        int r=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            r=x%10;
            s=s*10+r;
            x=x/10;
        }

        if(orginal_value==s){
            return true;
        }else{
            return false;
        }
        
    }
}