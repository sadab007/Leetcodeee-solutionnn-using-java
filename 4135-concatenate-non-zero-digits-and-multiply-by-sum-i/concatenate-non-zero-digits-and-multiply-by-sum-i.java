class Solution {
    public long sumAndMultiply(int n) {
       long x = n;
       long sum =0;
       long ans =0;
       while(x>0){
        long d = x%10;
        sum = sum + d;
        if(d >0){
            ans = d +ans*10;
        }
        x = x/10;
       }
       while(ans>0){
        long di = ans%10;
        x = di + x *10;
        ans = ans/10;
       }
       return  x*sum; 
    }
}