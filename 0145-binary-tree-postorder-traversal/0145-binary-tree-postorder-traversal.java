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
/*solution1: recursive 
class Solution {
    List<Integer> sol = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) { //postorder: left-righ-t-root
        if(root==null)
            return sol;    
        sol = postorderTraversal(root.left);
        sol = postorderTraversal(root.right);
        sol.add(root.val);
        return sol; 
    }
}*/

//solution2: iteravtive //using 2 stacks
/*class Solution {
  
    public List<Integer> postorderTraversal(TreeNode root) { //postorder: left-right-root
        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(root);
        
        while(!st.empty()){ 
            TreeNode curr = st.pop();
            st2.push(curr.val);
            if(curr.left!=null)
                st.push(curr.left);
            if(curr.right!=null)
                st.push(curr.right);
            
        }
        
        while(!st2.empty())
             res.add(st2.pop());
        
        return res; 
    }
}*/

//solution3
class Solution {
  
    public List<Integer> postorderTraversal(TreeNode root) { //postorder: left-right-root
        LinkedList<Integer> res = new LinkedList<>();
        if(root==null) return res;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.empty()){ 
            TreeNode curr = st.pop();
            res.addFirst(curr.val); //add at first , this method is like preorder but reverse
            if(curr.left!=null)
                st.push(curr.left);
            if(curr.right!=null)
                st.push(curr.right);
            
        }
       return res; 
    }
}