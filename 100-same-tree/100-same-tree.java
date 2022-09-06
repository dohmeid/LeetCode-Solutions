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
    ArrayList<TreeNode> plist = new ArrayList<TreeNode>(); 
    ArrayList<TreeNode> qlist = new ArrayList<TreeNode>(); 
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
            
        boolean lres = isSameTree(p.left,q.left);
        boolean rres = isSameTree(p.right,q.right);
        
        
        
       return lres && rres; 
    
}}