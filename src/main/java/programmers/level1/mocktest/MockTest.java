package programmers.level1.mocktest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MockTest {

    private int[] first = {1, 2, 3, 4, 5};
    private int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
    private int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    private int iterCount = 0;

    /**
     * 1. 정답 배열 입력받아 iter로 하나하나 마다 조건걸어 채점
     * */

    public int[] solution(int[] answer) {
        int [] answerCount = new int[3];

        for (int question : answer) {
            gradeAnswer(answerCount, question);
            iterCount++;
        }
//        Arrays.stream(answer).forEach(question -> {
//            gradeAnswer(answerCount, question);
//            iterCount++;
//        }); -> 가독성이 별로;

        int maxValue = Arrays.stream(answerCount).max().getAsInt();

        List<Integer> result = new ArrayList<>();
        pickWinner(answerCount, maxValue, result);

        return result.stream().mapToInt(x -> x).toArray();
    }

    private void gradeAnswer(int[] answerCount, int question) {
        if (first[iterCount % first.length] == question) {
            answerCount[0]++;
        }

        if (second[iterCount % second.length] == question) {
            answerCount[1]++;
        }

        if (third[iterCount % third.length] == question) {
            answerCount[2]++;
        }
    }

    private void pickWinner(int[] answerCount, int maxValue, List<Integer> result) {
        if (answerCount[0] == maxValue){
            result.add(1);
        }
        if (answerCount[1] == maxValue){
            result.add(2);
        }
        if (answerCount[2] == maxValue){
            result.add(3);
        }
    }
}
