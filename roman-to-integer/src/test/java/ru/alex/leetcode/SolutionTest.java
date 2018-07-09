package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author alexey
 * @version 7/6/18
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void testOne() {
        assertThat(this.solution.romanToInt("III"), is(3));
    }

    @Test
    public void testTwo() {
        assertThat(this.solution.romanToInt("LVIII"), is(58));
    }

    @Test
    public void testThree() {
        assertThat(this.solution.romanToInt("MCMXCIV"), is(1994));
    }
}