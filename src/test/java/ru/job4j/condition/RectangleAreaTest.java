package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void square() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void squareExpected2dot3472() {
        double p = 6.5;
        double k = 2;
        double expected = 2.35;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}