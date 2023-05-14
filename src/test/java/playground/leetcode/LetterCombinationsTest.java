package playground.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {

    @Test
    void case1() {
        //Input: digits = "23"
        //Output: List<String> ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        LetterCombinations solution = new LetterCombinations();
        List<String> expected = new ArrayList<>(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
        Collections.sort(expected);

        List<String> result = solution.letterCombinations("23");
        Collections.sort(result);
        assertEquals(expected, result);
    }
    @Test
    void case2() {
        //Input: digits = ""
        //Output: List<String> []
        LetterCombinations solution = new LetterCombinations();
        assertEquals(List.of(), solution.letterCombinations(""));
    }
    @Test
    void case3() {
        //Input: digits = "2"
        //Output: List<String> ["a","b","c"]
        LetterCombinations solution = new LetterCombinations();
        assertEquals(List.of("a", "b", "c"), solution.letterCombinations("2"));
    }
    @Test
    void case4(){
        // input: digits = "237"
        // output: List<String> ["adp","adq","adr","ads","aep","aeq","aer","aes","afp","afq","afr","afs","bdp","bdq","bdr","bds","bep","beq","ber","bes","bfp","bfq","bfr","bfs","cdp","cdq","cdr","cds","cep","ceq","cer","ces","cfp","cfq","cfr","cfs"]
        LetterCombinations solution = new LetterCombinations();
        List<String> expected = new ArrayList<>(List.of("adp","adq","adr","ads","aep","aeq","aer","aes","afp","afq","afr","afs","bdp","bdq","bdr","bds","bep","beq","ber","bes","bfp","bfq","bfr","bfs","cdp","cdq","cdr","cds","cep","ceq","cer","ces","cfp","cfq","cfr","cfs"));
        Collections.sort(expected);

        List<String> result = solution.letterCombinations("237");
        Collections.sort(result);
        assertEquals(expected, result);
    }
}