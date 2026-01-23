package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {

    @Test
    void answer() {
        String input = "Hi, Bot.";
        String result = DummyBot.answer(input);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void answer2() {
        String input = "Bye";
        String result = DummyBot.answer(input);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }
}