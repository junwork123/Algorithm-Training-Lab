package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 29,
        Title = "Divide Two Integers",
        Url = "https://leetcode.com/problems/divide-two-integers/"
)
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; //Cornor case when -2^31 is divided by -1 will give 2^31 which doesnt exist so overflow

        boolean isNegative = dividend < 0 ^ divisor < 0; //Logical XOR will help in deciding if the results is negative only if any one of them is negative

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0, shift = 0;

        while (dividend - divisor >= 0) {
            for (shift = 0; dividend - (divisor << shift << 1) >= 0; shift++);
            quotient += 1 << shift; //Add to the quotient
            dividend -= (divisor << shift); //Substract from dividend to start over with the remaining
        }
        return isNegative ? -quotient : quotient;
    }
}
