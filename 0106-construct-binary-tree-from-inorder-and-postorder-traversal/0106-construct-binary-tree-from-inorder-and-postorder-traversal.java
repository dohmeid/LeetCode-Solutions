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
    public TreeNode buildTree(int[] in, int[] post) {   
        if(in.length==1)    
            return new TreeNode(in[0]);
        i = in.length-1;
        return helper(in,post,0,i);
    }
    
    public TreeNode helper(int[] in, int[] post, int start, int end) {
        if(start>end)  
            return null;
        TreeNode root = new TreeNode(post[i--]);
        
        //to find index of root in inorder array
        int curr=-1;
         for(int j = in.length-1; j>=0; j--){
            if(in[j] == root.val){ 
                curr = j;
                break;
            }
        }
        
        root.right = helper(in,post, curr+1 , end );
        root.left = helper(in, post, start , curr-1);
        
        return root;
    }
   
}



