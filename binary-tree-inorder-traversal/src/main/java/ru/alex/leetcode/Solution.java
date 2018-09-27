package ru.alex.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * In-order
 * Check if the current node is empty or null.
 * Traverse the left subtree by recursively calling the in-order function.
 * Display the data part of the root (or current node).
 * Traverse the right subtree by recursively calling the in-order function.
 *
 * @author alexey
 * @version 25.09.18
 */
public class Solution {
    /**
     * Inorder traversal with recursion.
     *
     * @param rootNode tree root node
     * @return list of tree node values
     */
    public List<Integer> inorderTraversal(TreeNode rootNode) {
        List<Integer> result = new ArrayList<>();
        if (rootNode == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = rootNode;
        while (currentNode != null || !stack.empty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            result.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return result;
    }

    /**
     * Inorder traversal with recursion.
     *
     * @param rootNode tree root node
     * @return list of tree node values
     */
    public List<Integer> inorderTraversalRecursive(TreeNode rootNode) {
        List<Integer> result = new ArrayList<>();
        if (rootNode == null) return result;
        if (rootNode.left != null) {
            result.addAll(inorderTraversalRecursive(rootNode.left));
        }
        result.add(rootNode.val);
        if (rootNode.right != null) {
            result.addAll(inorderTraversalRecursive(rootNode.right));
        }
        return result;
    }

    public List<Integer> inorderMorris(TreeNode rootNode) {
        List<Integer> result = new ArrayList<>();
        TreeNode current = rootNode;
        while (current != null) {
            if (current.left == null) {
                result.add(current.val);
                current = current.right;
            } else {
                TreeNode previous = current.left;
                while (previous.right != null && previous.right != current) {
                    previous = previous.right;
                }
                if (previous.right == null) {
                    previous.right = current;
                    current = current.left;
                } else {
                    previous.right = null;
                    result.add(current.val);
                    current = current.right;
                }
            }
        }
        return result;
    }


    /**
     * Tree node.
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }


}
