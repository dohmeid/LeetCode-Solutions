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
    public List<Integer> postorderTraversal(TreeNode root) { //postorder: left-righ-t-root
        if(root==null)
            return sol;    
        sol = postorderTraversal(root.left);
        sol = postorderTraversal(root.right);
        sol.add(root.val);
        return sol; 
    }
}