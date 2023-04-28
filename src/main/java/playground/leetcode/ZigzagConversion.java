package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 6,
        Title = "ZigZag Conversion",
        Url = "https://leetcode.com/problems/zigzag-conversion/"
)
public class ZigzagConversion {
    // 1일때 대각선 : 0
    // 2일때 대각선 : 0
    // 3일때 대각선 : 1
    // 4일때 대각선 : 2
    // n일때 대각선 : n-2
    // cycle : numRows + 대각선

    // cycle : 3 + 1 = 4
    // 첫째 : 0, 0+4, 0+4+4, 0+4+4+4, ...
    // 둘째 : 1, 1+2, 1+2+2, 1+2+2+2, ...
    // 셋째 : 2, 2+4, 2+4+4, 2+4+4+4, ...

    // cycle : 4 + 2 = 6
    // 첫째 : 0, 0+6, 0+6+6, 0+6+6+6, ...
    // 둘째 : 1, 1+4, 1+4+2, 1+4+2+4, ...
    // 셋째 : 2, 2+2, 2+2+4, 2+2+4+2, ...
    // 넷째 : 3, 3+6,

    // cycle : 5 + 3 = 8
    // 첫째 : 0, 0+8, 0+8+8, 0+8+8+8, ...
    // 둘째 : 1, 1+6, 1+6+2, 1+6+2+6, ...
    // 셋째 : 2, 2+4, 2+4+4, 2+4+4+4, ...
    // 넷째 : 3, 3+2, 3+2+6, 3+2+6+2, ...
    // 다섯째 : 4, 4+8, 4+8+8, 4+8+8+8, ...
    char[] array;
    int diagonal;
    int cycle;
    public String convert(String s, int numRows) {
        if(numRows == 1) { return s; }
        array = s.toCharArray();
        diagonal = Math.max((numRows - 2), 0);
        cycle = numRows + diagonal;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numRows; i++) {
            sb.append(pickUp(i));
        }
        return sb.toString();
    }
    String pickUp(int index){
        StringBuilder sb = new StringBuilder();
        int turn=0;
        int gap = calculateGap(index);
        int inverseGap = calculateInverseGap(index);
        while (isSafeIndex(index)) {
            sb.append(array[index]);
            index += moveDistance(turn, gap, inverseGap);
            turn++;
        }
        return sb.toString();
    }
    int moveDistance(int turn, int gap, int inverseGap) {
        return turn % 2 == 0 ? gap : inverseGap;
    }
    int calculateInverseGap(int index) {
        return cycle - calculateGap(index) == 0 ? cycle : cycle - calculateGap(index);
    }
    int calculateGap(int index) {
        return cycle - (index * 2) == 0 ? cycle : cycle - (index * 2);
    }
    boolean isSafeIndex(int index) {
        return index >= 0 && index < array.length;
    }
}
