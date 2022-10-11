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
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(root==null)
            return null;
        if(depth == 1){
            TreeNode new_root = new TreeNode(val, root , null );
            return new_root;
        }
        
        if( depth==2 ){
            TreeNode l = new TreeNode(val, root.left , null );
            TreeNode r = new TreeNode(val,null ,root.right );
            root.left = l;
            root.right = r;
        }
        else{
            root.left = addOneRow(root.left,val,depth-1);
            root.right = addOneRow(root.right,val,depth-1);
        }
        
        return root;
    }
}






