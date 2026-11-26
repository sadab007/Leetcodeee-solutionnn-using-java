class Solution {
    public boolean canAliceWin(int n) {
         int s = 10 ;
         int count =0;
        while(n>=0){
            n -= s;
            s--;
            count++;
        }
        return count%2==0;
    }
}   