package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.regex.Matcher;

@ProblemInfo(
        Number = 8,
        Title = "String to Integer (atoi)",
        Url = "https://leetcode.com/problems/string-to-integer-atoi/"
)
public class StringToInteger {
    // 공백, 알파벳 무시
    // 부호 인식(+, -)
    // 최대, 최소값 넘어가면 최대, 최소값으로 clamp
    static final String STRING_INT_MAX = "+" + Integer.MAX_VALUE;
    static final String STRING_INT_MIN = "" + Integer.MIN_VALUE;
    static final int MAX_LENGTH_WITH_SIGN = 11;
    static final String NUMBER_REGEX = "[+-]?[0-9]+";
    static final String ALPAHBET_REGEX = "[a-zA-Z]";
    static final String START_WITH_ZERO_REGEX = "^[+-]?0+";
    static final String START_WITH_WHITE_SPACE_REGEX = "^[ ]+";
    public int myAtoi(String s) {
        return valueOf(convert(s));
    }

    private String convert(String s) {
        s = removeWhitespace(s);
        s = findFirstDigitChunk(s);
        s = appendSign(s);
        s = removeUseless(s);
        return s;
    }

    int valueOf(String s){
        if(isInvalidString(s)){ return 0; }
        if(s.startsWith("+") && isHigherThanMax(s)){ return Integer.MAX_VALUE; }
        if(s.startsWith("-") && isLowerThanMin(s)){ return Integer.MIN_VALUE; }
        return Integer.parseInt(s);
    }
    String removeUseless(String s){
        // 부호 바로 뒤에서 중복되는 0 제거
        Matcher matcher = java.util.regex.Pattern.compile(START_WITH_ZERO_REGEX).matcher(s);
        if(matcher.find()){
            s = s.charAt(matcher.start()) + s.substring(matcher.end());
        }
        // 숫자 뒤에 나오는 알파벳 제거
        return s.replaceAll(ALPAHBET_REGEX, "");
    }
    String findFirstDigitChunk(String s) {
        // 가장 처음 나오는 숫자 뭉치만 추출
        Matcher matcher = java.util.regex.Pattern.compile(NUMBER_REGEX).matcher(s);
        if(matcher.find() && matcher.start() == 0){
            return matcher.group();
        }
        return "";
    }
    String removeWhitespace(String s){
        Matcher matcher = java.util.regex.Pattern.compile(START_WITH_WHITE_SPACE_REGEX).matcher(s);
        if(matcher.find()){
            s = s.substring(matcher.end());
        }
        return s;
    }
    String appendSign(String s){
       if(s.startsWith("+") || s.startsWith("-")){
           return s;
       }
       return "+" + s;
    }
    boolean isInvalidString(String s){
        return s.isEmpty() || s.equals("+") || s.equals("-");
    }
    boolean isHigherThanMax(String s){
        return s.length() > MAX_LENGTH_WITH_SIGN ||
                (s.length() == MAX_LENGTH_WITH_SIGN && s.compareTo(STRING_INT_MAX) > 0);
    }
    boolean isLowerThanMin(String s){
        return s.length() > MAX_LENGTH_WITH_SIGN ||
                (s.length() == MAX_LENGTH_WITH_SIGN && s.compareTo(STRING_INT_MIN) > 0);
    }
}
