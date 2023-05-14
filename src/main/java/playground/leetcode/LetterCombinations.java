package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.*;

@ProblemInfo(
        Number = 17,
        Title = "Letter Combinations of a Phone Number",
        Url = "https://leetcode.com/problems/letter-combinations-of-a-phone-number/"
)
public class LetterCombinations {
    List<String> result = new ArrayList<>();
    final Map<String, List<String>> letterMap = new HashMap<>() {
        {
            put("2", List.of("a", "b", "c"));
            put("3", List.of("d", "e", "f"));
            put("4", List.of("g", "h", "i"));
            put("5", List.of("j", "k", "l"));
            put("6", List.of("m", "n", "o"));
            put("7", List.of("p", "q", "r", "s"));
            put("8", List.of("t", "u", "v"));
            put("9", List.of("w", "x", "y", "z"));
        }
    };

    public List<String> letterCombinations(String digits) {
        // { 2, 3, 7 }, { }
        // { 3, 7 }, 2 -> ( a, b, c ) => { a, b, c }
        // { 7 }, 3 -> ( d, e, f ) => { ad, ae, af, bd, be, bf, cd, ce, cf }
        // { }, 7 -> ( p, q, r, s ) => { adp, adq, adr, ads, aep, aeq, aer, aes, afp, afq, afr, afs, bdp, bdq, bdr, bds, bep, beq, ber, bes, bfp, bfq, bfr, bfs, cdp, cdq, cdr, cds, cep, ceq, cer, ces, cfp, cfq, cfr, cfs }

        List<String> targetDigits = new ArrayList<>(Arrays.asList(digits.split(""))); // ImmutableCollections 방지
        combine(targetDigits, new ArrayList<>());
        return result;
    }

    void combine(List<String> targetDigits, List<String> nowList) {
        // 전달받은 리스트 안에, digits를 하나씩 넣기
        // 종료조건 : 모든 digits를 끝냈을때
        if(targetDigits.isEmpty()) { result.addAll(nowList); return; }
        String targetLetter = targetDigits.get(0);
        List<String> remainTargetDigits = targetDigits.subList(1, targetDigits.size());

        if(!letterMap.containsKey(targetLetter)) { return; }
        List<String> letterList = letterMap.get(targetLetter);

        if(nowList.isEmpty()) {
            nowList.addAll(letterList);
            combine(remainTargetDigits, nowList);
        } else {
            for(String letter : letterList) {
                List<String> newList = new ArrayList<>(nowList);
                newList.replaceAll(s -> s + letter);
                combine(remainTargetDigits, newList);
            }
        }
    }
}
