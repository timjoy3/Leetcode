/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 丢失的数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i <= nums.length; i++) {
            res ^= i;
        }
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }
}
// @lc code=end

