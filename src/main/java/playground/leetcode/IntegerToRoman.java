package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.HashMap;
import java.util.Map;

@ProblemInfo(
        Number = 12,
        Title = "Integer to Roman",
        Url = "https://leetcode.com/problems/integer-to-roman/"
)
public class IntegerToRoman {
    final Map<Integer, String> map = new HashMap<>(){{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] divisors = new int[]{1000, 100, 10, 1};
        for (int divisor : divisors) {
            int quotient = num / divisor;
            sb.append(getRoman(quotient, divisor));
            num %= divisor;
        }
        return sb.toString();
    }
    String getRoman(int quotient, int divisor) {
        if (quotient == 0) { return ""; }
        if (quotient == 9 || quotient == 4) {
            return map.get(quotient * divisor);
        } else if (quotient >= 5) {
            return map.get(5 * divisor) + map.get(divisor).repeat(quotient - 5);
        } else {
            return map.get(divisor).repeat(quotient);
        }
    }
}
