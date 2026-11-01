class Solution {
    public int minMergedInteger(int[] nums) {

        int n = nums.length;
        int digit0 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i += 2) {

            int count = 0;
            int sam = nums[i + 1];

            while (sam > 0) {
                count++;
                sam /= 10;
            }

            int digit = nums[i] * (int)Math.pow(10, count)
                        + nums[i + 1];

            if (digit0 > digit) {
                digit0 = digit;
            }
        }

        return digit0;
    }
}