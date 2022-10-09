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
    Map<Integer, Integer> map = new HashMap<>(); //val is the key,  complement = sum-val is the value
    public boolean findTarget(TreeNode root, int k) {
        
        if(root.left==null && root.right==null & root.val!=k) //1 node case
            return false;
    
        //put each value and it's complement for the sum in hashap
        fillMap(root,k);
        
        //check if the complement of the number exists
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue() ;
            if(map.containsKey(val) && key != val)
                return true;
        }

        return false;
    }
    
    //DFS to traverse tree
    public void fillMap(TreeNode t, int k){
        if(t == null)
            return ;
        int c = k -t.val;
        map.put(t.val,c);
        fillMap(t.left,k);
        fillMap(t.right,k);
    }
    
    
}