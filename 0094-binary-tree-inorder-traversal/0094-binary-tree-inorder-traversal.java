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

//solution1: recursive
class Solution {
    List<Integer> sol = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) { //inorder: left-root-right
        if(root==null)
            return sol;    
        sol = inorderTraversal(root.left);
        sol.add(root.val);
        sol = inorderTraversal(root.right);
        return sol;
    }
}