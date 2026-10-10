class Solution {
    public int thirdMax(int[] nums) {
        long l = Long.MIN_VALUE;
        long sl = Long.MIN_VALUE;
        long tl = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > l) {
                tl = sl;
                sl = l;
                l = nums[i];
            } else if (nums[i] > sl && nums[i] != l) {
                tl = sl;
                sl = nums[i];
            } else if (nums[i] > tl && nums[i] != sl  && nums[i]!= l) {
                tl = nums[i];
            }
        }
        if (tl == Long.MIN_VALUE) {
            return (int) l;
        } else {
            return (int) tl;
        }

    }
}