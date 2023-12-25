package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenMaxFromTwoNumbers() {
        Max max = new Max();
        assertThat(max.max(3, 5), is(5));
    }

    @Test
    public void whenMaxFromThreeNumbers() {
        Max max = new Max();
        assertThat(max.max(3, 5, 4), is(5));
    }

    @Test
    public void whenMaxFromFourNumbers() {
        Max max = new Max();
        assertThat(max.max(3, 5, 4, 8), is(8));
    }
}
