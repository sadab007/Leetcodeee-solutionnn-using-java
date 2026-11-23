class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =nums[0];i>=2;i--){
        if(nums[n-1]%i==0  && nums[0]%i==0){
            return i;
        }
        }
            return 1;
    }
}
