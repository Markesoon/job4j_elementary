package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To6To23Then23() {
        int left = 6;
        int up = 23;
        int result = Max.max(left, up);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To4To51To101Then101() {
        int up = 51;
        int third = 101;
        int result = Max.max(up, third);
        int expected = 101;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Thenequals() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}