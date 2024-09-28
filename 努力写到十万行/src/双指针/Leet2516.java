/*
 *太原学院计科系 拥有本软件版权2021，并保留所有权限、
 *Copyright 2021，YCHS Iformation&science Technology Co.,Ltd,
 *All rights reserved.
 */
package 双指针;

/**
 * @author liuzhuo
 * @version 1.0
 * @date 2024/9/27
 */
public class Leet2516 {
    public int takeCharacters(String s, int k) {
        int[] cnt = new int[3];
        int len = s.length();
        int ans = len;
        for (int i = 0; i < len; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k) {
            ans = Math.min(ans, len);
        } else {
            return -1;
        }

        int l = 0;
        for (int r = 0; r < len; r++) {
            cnt[s.charAt(r) - 'a']--;
            while (l < r && (cnt[0] < k || cnt[1] < k || cnt[2] < k)) {
                cnt[s.charAt(l) - 'a']++;
                l++;
            }
            if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k) {
                ans = Math.min(ans, len - (r - l + 1));
            }
        }

        return ans;
    }
}
