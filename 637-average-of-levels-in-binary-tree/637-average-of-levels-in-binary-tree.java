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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> sol = new ArrayList<Double>(); 
        if(root == null)
            return sol;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            double sum=0;
            int len = q.size(); 
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if(curr.right != null)
                    q.offer(curr.right);
                if(curr.left != null)
                    q.offer(curr.left);
            }
            double avg = sum/len;
            sol.add(avg);
            
        }
        
        return sol;
    }
}