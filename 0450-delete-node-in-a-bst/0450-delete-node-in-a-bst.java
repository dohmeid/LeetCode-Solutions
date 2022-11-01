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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        if(root.val > key)
            root.left = deleteNode(root.left,key);
        else if(root.val < key)
            root.right = deleteNode(root.right,key);
        
        else if(root.val==key){    
            if(root.right==null && root.left==null)
                root = null;
            else if(root.right==null)
                root = root.left;
            else if(root.left==null)
                root = root.right;
            else{
                TreeNode min = root.right;
                while(min.left != null) //to find the least value node to make it the new root;
                    min = min.left;
                root.val = min.val;
                root.right  = deleteNode(root.right , min.val);
            }
            
        }
        
        return root;
    }
}