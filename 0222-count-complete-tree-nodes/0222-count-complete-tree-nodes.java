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
    int num=0;
    public int countNodes(TreeNode root) {
        
        if(root==null)
            return num;
        else
            num++;
        
        countNodes(root.left);
        countNodes(root.right);
        
        
        return num;
    }
}