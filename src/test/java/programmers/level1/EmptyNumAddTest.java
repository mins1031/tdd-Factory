package programmers.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EmptyNumAddTest {

    @Test
    void name() {
        //given
        int[] numbers = {0,1,2,3,4,6,8};
        //when
        EmptyNumAdd emptyNumAdd = new EmptyNumAdd();
        int result = emptyNumAdd.solution(numbers);
        //then
        // 5+7+9 = 21
        Assertions.assertThat(result).isEqualTo(21);
    }
}