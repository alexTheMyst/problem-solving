package ru.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Tests for Binary Tree Inorder Traversal.
 */
public class SolutionTest {

    private Solution.TreeNode rootNode;

    @Before
    public void setUp() {
        this.rootNode = new Solution.TreeNode(1);
        Solution.TreeNode treeNodeTwo = new Solution.TreeNode(2);
        Solution.TreeNode treeNodeThree = new Solution.TreeNode(3);
        this.rootNode.right=treeNodeTwo;
        treeNodeTwo.left=treeNodeThree;
    }

    @Test
    public void iterativeMethodTest() {
        List<Integer> rightAnswer = Arrays.asList(1, 3, 2);

        Solution solution = new Solution();

        assertThat(solution.inorderTraversal(this.rootNode), is(rightAnswer));
    }

    @Test
    public void recursiveMethodTest() {
        List<Integer> rightAnswer = Arrays.asList(1, 3, 2);

        Solution solution = new Solution();

        assertThat(solution.inorderTraversalRecursive(this.rootNode), is(rightAnswer));
    }

    @Test
    public void morrisMethodTest() {
        List<Integer> rightAnswer = Arrays.asList(1, 3, 2);

        Solution solution = new Solution();

        assertThat(solution.inorderMorris(this.rootNode), is(rightAnswer));
    }
}