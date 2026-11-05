class Solution {
    public int search(int[] nums, int t) {
        int l = 0;
        int r =nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<t){
                l = mid+1;
            }
            else if(nums[mid]>t){
                r = mid-1;
            }
            else if(nums[mid]==t){
                return mid;
            }
        }
           
                return -1;
            
        
    }
}