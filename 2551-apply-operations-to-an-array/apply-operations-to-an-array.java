class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans [] = new int [n];
        for(int i=0;i<n;i++){
             ans[i] = nums[i];
        }
        for(int i=0;i<n-1;i++){
            // ans[i] = nums[i];
            // ans[i+1] = nums[i+1];
            if(nums[i]==nums[i+1]){
                ans[i] = nums[i] * 2;
                ans[i+1] = 0;
                i++;
            }
        } 
        for(int i=0;i<n;i++){
            if(ans[i]!=0){
                ans[count] = ans[i];
                count++;
            }
        }
        while(count<n){
            ans[count]= 0;
            count++;
        }
        
    return ans;
    }
}