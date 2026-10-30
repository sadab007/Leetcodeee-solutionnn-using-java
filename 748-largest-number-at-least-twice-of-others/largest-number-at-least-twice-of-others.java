class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int l = -1;
        int sl = -1;
        int ans =0;
        for(int i =0 ;i<n;i++){
            if(nums[i]>l){
                sl = l;
                l = nums[i];
                ans = i;
            }
            else if(nums[i]>sl){
                sl = nums[i];
            }
        }
        if(l>=(sl*2)){
            return ans;
        }
        else{
            return -1;
        }
    }
}