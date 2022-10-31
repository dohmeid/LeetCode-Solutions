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
class BSTIterator { // inorder : left,root,right
    Queue<TreeNode> q = new LinkedList();
    
    public BSTIterator(TreeNode root) {
       fill(root);
    }
    
    public void fill(TreeNode root) {
        if(root==null)
            return;
        fill(root.left);
        q.offer(root);
        fill(root.right);
    }
    
    public int next() {
        return  q.poll().val;
    }
    
    public boolean hasNext() {
        return (q.size()!=0) ;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */