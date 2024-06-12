package com.ki;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("배열의 평균값")
    void t1() {
        assertThat(new Solution().solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})).isEqualTo(new int[]{3, 4, 1, 0, 2});
    }


}