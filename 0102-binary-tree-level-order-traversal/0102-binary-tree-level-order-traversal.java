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
    public List<List<Integer>> levelOrder(TreeNode root) { //solution using BFS with queue
        
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)  return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(q.size() > 0){
            List<Integer> list = new ArrayList<Integer>();
            int s = q.size();
            for(int i=0; i<s;i++){
                TreeNode node = q.remove() ;  //get the first element in queue
                list.add(node.val);
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            res.add(list);
     }
        
        return res;
    }
}