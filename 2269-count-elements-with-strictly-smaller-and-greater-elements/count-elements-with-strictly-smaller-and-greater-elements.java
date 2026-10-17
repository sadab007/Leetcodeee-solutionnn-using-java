class Solution {
    public int countElements(int[] nums) {
        int min=0;
        int max =0;
        int ans =0;
       for(int i=0;i<nums.length;i++){
        max =0;
        min =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    max++;
                }
                if(nums[i]<nums[j]){
                    min++;
                }
            }
            if(max>0 && min>0 ){
                ans++;
            }
       }
       return ans;
    }
}