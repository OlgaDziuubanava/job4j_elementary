package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void rubleToDollar() {
        float input = 180;
        float expected = 3;
        float value = 0.0001f;
        float output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected, withPrecision(value));

    }
}