package ru.alex.leetcode.medium01;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author alexey
 * @version 7/3/18
 */
public class SoutionTest {

    private ListNode l1, l2;

    private Soution soution;

    @Before
    public void setUp() {
        l1 = new ListNode(2);
        l2 = new ListNode(2);
        soution = new Soution();
    }

    @Test
    public void whenSumLists_ThenGetListWithResult() {
        ListNode result = this.soution.addTwoNumbers(this.l1, this.l2);
        assertThat(result.val, is(4));
    }

}