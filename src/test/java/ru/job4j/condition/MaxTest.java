package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void max1() {
        int left = 187;
        int right = 88;
        int expected = 187;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void max2() {
        int left = 187;
        int right = 188;
        int expected = 188;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void max3() {
        int left = 188;
        int right = 188;
        int expected = 188;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

}