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
     List<Integer> sol = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) { //left-root-right
        
        if(root != null){
        if(root.left != null)
             sol = inorderTraversal(root.left);
        
        sol.add(root.val);
        
        if(root.right != null)
            sol = inorderTraversal(root.right);
        }
        return sol;
    }
}