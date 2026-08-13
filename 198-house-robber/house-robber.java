class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return robbery(n-1, nums, dp);
    }
    static int robbery(int index, int[] nums, int[] dp) {
        if(index == 0)
            return nums[0];
        if(index == 1)
            return Math.max(nums[0], nums[1]);
        if(dp[index] != -1)
            return dp[index];
        return dp[index] = Math.max(nums[index] + robbery(index-2, nums, dp),
            robbery(index-1, nums, dp));
    }
}