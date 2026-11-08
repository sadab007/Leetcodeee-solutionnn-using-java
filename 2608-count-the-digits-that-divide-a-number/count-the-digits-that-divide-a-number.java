class Solution {
    public int countDigits(int num) {
        int count =0;
        int exm= num;
        while(num>0){
            int d = num%10;
            if(exm%d==0){
                count++;
            }
            num = num/10;

        }
        return count;
    }
}