package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void manWeight() {
        short input = 187;
        double output = Fit.manWeight(input);
        double expected = 100.05;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void womanWeight() {
        short input = 187;
        double output = Fit.womanWeight(input);
        double expected = 88.55;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}