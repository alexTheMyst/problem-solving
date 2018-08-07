package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author alexey
 * @version 13.07.18
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void whenTwoListsWithOneElement_ThenGetListWithTwoElements() {
        Solution.ListNode listOne = new Solution.ListNode(1);
        Solution.ListNode listTwo = new Solution.ListNode(2);

        Solution.ListNode resultList = this.solution.mergeTwoLists(listOne, listTwo);

        assertThat(resultList.next, is(notNullValue()));
    }
}