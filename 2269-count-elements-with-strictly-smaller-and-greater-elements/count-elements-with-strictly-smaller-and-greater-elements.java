class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
       int k=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[0] && nums[i]<nums[n-1]){
            k++;
        }
       }
       return k;
    }
}