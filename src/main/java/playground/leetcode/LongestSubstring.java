package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 3,
        Title = "Longest Substring Without Repeating Characters",
        Url = "https://leetcode.com/problems/longest-substring-without-repeating-characters/"
)
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int[] charMap = new int[128]; // map보다 접근이 빠르고, contains 후 값을 넣기 위해 재탐색할 필요가 없음
        int start = 0;
        int end = 0;
        while (isSafeIndex(s, end)) {
            char c = s.charAt(end); // end가 가리키는 문자
            if (contains(charMap, c)) { // 이미 등장한 문자라면
                start = Math.max(start, charMap[c]); // start를 최근 등장한 위치로 이동
            }
            charMap[c] = end + 1; // 문자의 최근 위치를 기록
            max = Math.max(max, end - start + 1); // 최대 길이 갱신
            end++; // end를 이동시킴
        }
        return max;
    }
    boolean isSafeIndex(String s, int index) { return index < s.length(); }
    boolean contains(int[] charMap, char c) { return charMap[c] > 0; }
}
