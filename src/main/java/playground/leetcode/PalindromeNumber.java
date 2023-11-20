package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 9,
        Title = "Palindrome Number",
        Url = "https://leetcode.com/problems/palindrome-number/"
)
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // 1. 음수인 경우 : false
        // 2. 0~9인 경우 : true
        // 3. 10 이상인 경우 : 10으로 나눈 나머지를 뒤집어서 비교
        if (x < 0) { return false; }
        if (x < 10) { return true; }
        String target = String.valueOf(x);
        int length = target.length();
        for (int i = 0; i < length / 2; i++) {
            if (isNotPalindromePart(target, i)) { return false; }
        }
        return true;
    }
    private boolean isNotPalindromePart(String target, int i) {
        return target.charAt(i) != target.charAt(target.length() - 1 - i);
    }
}
