class Solution {
    public int maxProduct(int n) {
        int m1 =0;
        int m2 =0;
        while(n>0){
            int t =n%10;
            if(t>=m1){
                m2 = m1;
                m1 = t;
            } 
            else if(t>m2){
                m2 = t;
            }
            n = n/10;
        }
        return m1*m2;
    }
}