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
//solution1: recursive
/*class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) { //pre-order : root->left->right 
        if(root==null)
            return res;
        res.add(root.val);
        res = preorderTraversal(root.left);
        res = preorderTraversal(root.right);
        return res;
    }
}*/


//solution2: iteravtive
class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) { //pre-order : root->left->right 
        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.empty()){
            TreeNode curr = st.pop();
            res.add(curr.val);
            if(curr.right!=null)
                st.push(curr.right);
            if(curr.left!=null)
                st.push(curr.left);
        }
        return res;
    }
}





