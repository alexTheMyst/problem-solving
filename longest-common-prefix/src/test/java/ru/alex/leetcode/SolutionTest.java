package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author alexey
 * @version 7/9/18
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void whenInputHasCommonPrefix_ThenReturnIndex() {
        String[] strings = {"flower","flow","flight"};
        assertThat(this.solution.longestCommonPrefix(strings), is("fl"));
    }

    @Test
    public void whenInputDoesNotHaveCommonIndex_ThenBlankString() {
        String[] strings = {"dog","racecar","car"};
        assertThat(this.solution.longestCommonPrefix(strings), is(""));
    }

    @Test
    public void whenOneOfInputStringsBlank_ThenBlankString() {
        String[] strings = {"abab","aba",""};
        assertThat(this.solution.longestCommonPrefix(strings), is(""));
    }

    @Test
    public void whenInputHasOnlyOneString_ThenReturnString() {
        String[] strings = {"a"};
        assertThat(this.solution.longestCommonPrefix(strings), is("a"));
    }

}