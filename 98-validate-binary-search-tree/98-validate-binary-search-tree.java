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
    public boolean isValidNode(TreeNode root, long min, long max) {
        
        if(root == null)
            return true;
        
        if(root.val<=min || root.val>=max)
            return false;
         
        return isValidNode(root.left,min,root.val) && isValidNode(root.right,root.val,max) ;
        
    }
    
    public boolean isValidBST(TreeNode root) {
                return isValidNode(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}