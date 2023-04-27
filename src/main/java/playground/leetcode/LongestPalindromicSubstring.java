package playground.leetcode;

public class LongestPalindromicSubstring {
    char[] chars;
    int start, maxLen;
    public String longestPalindrome(String s) {
        if(s.length() == 1) { return s; }
        if(s.length() == 2 && s.charAt(0) == s.charAt(1)) { return s; }

        this.chars = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            expand(i, i); // 홀수 길이
            expand(i, i+1); // 짝수 길이
        }

        return s.substring(start, start + maxLen);
    }
    void expand(int left, int right){
        while(isPartOfPalindrome(left, right)){
            left--;
            right++;
        }
        if(maxLen < right - left - 1){
            maxLen = right - left - 1;
            start = left + 1;
        }
    }
    boolean isPartOfPalindrome(int left, int right){ // 좌우가 팰린드롬 조건에 해당하는지
        return isSafeIndex(left)
                && isSafeIndex(right)
                && chars[left] == chars[right];
    }
    boolean isSafeIndex(int index){ return index >= 0 && index < chars.length; }
}
