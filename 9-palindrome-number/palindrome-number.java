class Solution {
    public boolean isPalindrome(int x) {

        int lastdigit=0;
        int orginal_value=x;
        int s=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            lastdigit=x%10;
            s=s*10+lastdigit;
            x=x/10;    
        }

        if(orginal_value==s){
            return true;
        }else{
            return false;
        }

        
    }
}