/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int idx = -1;
        String first = strs[0];

        while (idx < first.length()) {
            int count = 0;

            for (int i = 1; i < strs.length; i++) {
                String word = strs[i];

                if (idx < word.length() && first.substring(0, idx + 1).equals(word.substring(0, idx + 1))) {
                    count++;
                }
            }

            if (count == strs.length - 1) {
                idx++;
            } else {
                break;
            }
        }

        if (idx != -1) {
            return first.substring(0, idx);
        } else {
            return "";
        }
    }
}
