package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alexey
 * @version 7/10/18
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void whenOnePair_ThenTrue() {
        assertThat(this.solution.isValid("()"), is(true));
    }

    @Test
    public void whenThreeDifferentPairsInOrder_ThenTrue() {
        assertThat(this.solution.isValid("()[]{}"), is(true));
    }

    @Test
    public void whenNonMatchingPair_ThenFalse() {
        assertThat(this.solution.isValid("(]"), is(false));
    }

    @Test
    public void whenTwoInterleavedPairs_ThenFalse() {
        assertThat(this.solution.isValid("([)]"), is(false));
    }

    @Test
    public void whenOnePairInsideOther_ThenTrue() {
        assertThat(this.solution.isValid("{[]}"), is(true));
    }

    @Test
    public void whenFirstCharIsClosedBracket_ThenFalse() {
        assertThat(this.solution.isValid("]{"), is(false));
    }

    @Test
    public void whenBlankString_ThenTrue() {
        assertThat(this.solution.isValid(""), is(true));
    }

    @Test
    public void whenCloseBeforeOpen_ThenFalse() {
        assertThat(this.solution.isValid("(()])}[}[}[]][}}[}{})][[(]({])])}}(])){)((){"), is(false));
    }
}