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
    public int maxDepth(TreeNode root) {
       if(root == null){
        return 0;
       }

       int leftDepth = maxDepth(root.left);
       int rightDepth = maxDepth(root.right);


       return Math.max(leftDepth , rightDepth)+1;
    }
}


// The +1 is there to count the current node you are at in the tree. Every time you move up one level from a child node to its parent, you need to add 1 to the depth because you're one step higher in the tree.