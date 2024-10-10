/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);  // Call helper function with no bounds initially
    }

    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        // Base case: If we reach a null node, it's a valid BST
        if (node == null) {
            return true;
        }

        // Check if the current node's value violates the min/max constraints
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Recursively validate the left subtree with updated max value
        // Recursively validate the right subtree with updated min value
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
