class Solution {
    public int findClosestNumber(int[] nums) {
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(min)){
                min = nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(min) && min<nums[i]){
                    min = nums[i];
            }
        }
        return min;
    }
}