package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To6To23Then23() {
        int left = 6;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To6To2To23Then23() {
        int first = 6;
        int second = 2;
        int third = 23;
        int result = Max.max(first, second, third);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2To2To2To3Thene3() {
        int first = 2;
        int second = 2;
        int third = 2;
        int four = 3;
        int result = Max.max(first, second, third, four);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

}