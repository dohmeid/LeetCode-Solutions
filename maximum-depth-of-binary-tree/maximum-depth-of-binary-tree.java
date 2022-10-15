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

/*class Solution { //Bottom-up recursion solution
  
    public int maxDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        
        int left = maxDepth(root.left) ;
        int right = maxDepth(root.right);
        
        return Math.max(left, right)+1;
    }
}*/


 //Top-down recursion solution
class Solution { 
    int ans=0;
    public int maxDepth(TreeNode root) {    
        return helper(root,1);
    }
    public int helper(TreeNode root, int d) {    
        if(root==null)
            return 0;
         if (root.left == null && root.right == null) 
                ans = Math.max(ans, d);
        helper(root.left,d+1);
        helper(root.right,d+1);
        return ans;
    }
    
}



