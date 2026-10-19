class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int l[] = new int[n];
        int r[]= new int [n];
       int L = 0;
       int R = 0;
       for(int i = 0; i<n;i++){
        l[i]= L;
        r[n-i-1] = R;
        if(i!=0){
            L += nums[i-1];
            l[i] = L;
            R += nums[n-i];
            r[n-i-1] = R;
        }
       }
       for(int i=0;i<n;i++){
        nums[i] = Math.abs(l[i] - r[i]);
       }
       return nums;
    }
}