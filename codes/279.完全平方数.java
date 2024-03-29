/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {//直接避免i-j*j<0的情况，真是妙啊
                min = Math.min(min, dp[i - j * j]); // min(dp[i-cj])
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
// @lc code=end

