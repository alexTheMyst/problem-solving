package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author alexey
 * @version 7/4/18
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void testOne() {
        assertThat(this.solution.myAtoi("42"), is(42));
    }

    @Test
    public void testTwo() {
        assertThat(this.solution.myAtoi("  -42"), is(-42));
    }

    @Test
    public void testThree() {
        assertThat(this.solution.myAtoi("9223372036854775808"), is(2147483647));
    }
}