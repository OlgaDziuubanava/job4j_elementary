package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    public void nullCheck() {
        int expected = 0;
            int result = Counter.sum(5, 4);
            assertThat(result).isEqualTo(expected);
    }

    @Test
    public void positiveCheck() {
        int expected = 10;
        int result = Counter.sum(1, 4);
        assertThat(result).isEqualTo(expected);
    }

}