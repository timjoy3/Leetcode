/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */
import java.util.Map;
import java.util.HashMap;

// @lc code=start
class Solution {
    int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<Character, Integer>();
    
        int left = 0, right = 0;
        int res = 0; // 记录结果
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!window.containsKey(c)){
                right++;
                window.put(c, 1);
            }else{
                res = Math.max(res, right - left);
                while(window.get(c) > 0){
                    char d = s.charAt(left);
                    left++;
                    window.put(d, window.get(d) - 1);
                    if (window.get(d) == 0) window.remove(d);
                }
            }
            // // 进行窗口内数据的一系列更新
            // window.put(c, window.getOrDefault(c, 0) + 1);
            // // 判断左侧窗口是否要收缩
            // while (window.get(c) > 1) {
            //     char d = s.charAt(left);
            //     left++;
            //     // 进行窗口内数据的一系列更新
            //     window.put(d, window.get(d) - 1);
            // }
            // // 在这里更新答案
            // res = Math.max(res, right - left);
        }
        return res;
    }
}
// @lc code=end

