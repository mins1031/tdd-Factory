package programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.level1.mocktest.MockTest;

class MockTestTest {

    /**
     * 1. 우선 인풋은 int배열, 아웃풋도 int배열
     * 2.
     */
    @Test
    void name() {
        //given
        int[] answer = {1, 2, 3, 4, 5};
        int[] result = {1};
//        int[] answer = {1, 3, 2, 4, 2};
//        int[] result = {1, 2, 3};
        MockTest mockTest = new MockTest();
        //when
        int[] solution = mockTest.solution(answer);
        // then
        Assertions.assertThat(solution).contains(result);
        Assertions.assertThat(solution).hasSize(1);
    }
}