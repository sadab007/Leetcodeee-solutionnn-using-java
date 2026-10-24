class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res =0;
        long les = 0;
        for(int x :nums )
       {
            if(x>= minK && x<=maxK){
                les++;
                res+=les;
            }
            else{
                les =0;
            }
        }
        return res;
    }
}