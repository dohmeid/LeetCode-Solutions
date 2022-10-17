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
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         if(preorder.length==1)    
            return new TreeNode(preorder[0]);
        
        return helper(inorder,preorder,0,preorder.length-1);
    }
    
      public TreeNode helper(int[] in, int[] pre, int start, int end) {
        if(start>end)  
            return null;
        TreeNode root = new TreeNode(pre[i++]);
        
        //to find index of root in inorder array
        int curr=-1;
         for(int j = 0; j<in.length; j++){
            if(in[j] == root.val){ 
                curr = j;
                break;
            }
        }
        
        root.left = helper(in, pre, start , curr-1);
        root.right = helper(in,pre, curr+1 , end );
        
        return root;
    }
}