class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1;
        }

        if(n==Integer.MIN_VALUE){
            return 1 /(myPow(x,Integer.MAX_VALUE)*x);
        }

        if(n<0){
            x=1/x;
            n=-n;
        }

                return Math.pow(x, n);


       

    }
}