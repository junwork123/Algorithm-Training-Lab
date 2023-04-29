package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 6,
        Title = "Reverse Integer",
        Url = "https://leetcode.com/problems/reverse-integer/"
)
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int pop = x % 10;
            x = x / 10;

            if (isHigherThanTens(result) || isHigherThanOnes(result, pop)) return 0;
            if (isLowerThanTens(result) || isLowerThanOnes(result, pop)) return 0;

            result = result*10 + pop;
        }
        return result;
    }

    boolean isLowerThanOnes(int result, int pop) {
        return result == Integer.MIN_VALUE / 10 && pop < -8;
    }

    boolean isLowerThanTens(int result) {
        return result < Integer.MIN_VALUE / 10;
    }

    boolean isHigherThanOnes(int result, int pop) {
        return result == Integer.MAX_VALUE / 10 && pop > 7;
    }

    boolean isHigherThanTens(int result) {
        return result > Integer.MAX_VALUE / 10;
    }
}
