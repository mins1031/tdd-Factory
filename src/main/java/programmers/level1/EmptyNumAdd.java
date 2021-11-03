package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmptyNumAdd {

    public int solution(int[] answers) {
        int result = 0;
        int arrCount = 0;
        int[] comparisonArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.stream(comparisonArr).forEach(comparison -> {

        });

        for (int comparison : comparisonArr) {
            if (arrCount >= answers.length || comparison != answers[arrCount]) {
                result += comparison;
                continue;
            }
            arrCount++;
        }

        return result;
    }
}
