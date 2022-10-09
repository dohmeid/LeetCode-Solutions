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
    
    public List<TreeNode> generateTrees(int n) {
        if(n==1){
            List<TreeNode> res = new ArrayList<>();
            res.add( new TreeNode(1) );
            return res;   
        }
        else
            return helper(1,n);
    }
    
    public List<TreeNode> helper(int start , int end) {
        List<TreeNode> res = new ArrayList<>();
        
        if(start > end) {
            res.add(null);
            return res;
        }
        
        else{
            for(int i = start; i <= end; i++){
                
                List<TreeNode> leftSubTree = helper(start,i-1); 
                List<TreeNode> rightSubTree = helper(i+1,end); 
                
                for(TreeNode left : leftSubTree){
                    for(TreeNode right : rightSubTree){
                        
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        res.add(root);
                        
                    }
                }
                
            }
        }
        
        return res;
    }
    
}