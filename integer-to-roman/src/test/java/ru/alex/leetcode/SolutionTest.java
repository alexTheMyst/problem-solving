package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author alexey
 * @version 7/5/18
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void whenInputArabic_ThenReturnRoman() {
        assertThat(this.solution.intToRom(3), is("III"));
    }
}