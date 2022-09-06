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
    ArrayList<TreeNode> plist = new ArrayList<TreeNode>(); 
    ArrayList<TreeNode> qlist = new ArrayList<TreeNode>(); 
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p!=null && q==null) return false;
        if(p==null && q!=null) return false;
        if(p.val != q.val) return false;
            
        traverse(p,plist);
        traverse(q,qlist);
         if(plist.size() != qlist.size())return false;
        for(int i=0;i<plist.size();i++){
            TreeNode l1 = plist.get(i);
            TreeNode l2 = qlist.get(i); 
           
            if(l1 != null && l2==null)
                return false;
            else if(l1 == null && l2!=null)
                return false;
            else if(l1 == null && l2==null)
                continue;
            else if( l1.val != l2.val )
                return false;
        }
        
      //  if(plist.equals(qlist) == true)
            return true;
       
    }
    
    
    
     public void traverse(TreeNode t,ArrayList<TreeNode> l){ //in-order traversal : left then root then right
         
         if(t.left != null)
           traverse(t.left,l);
         l.add(t.left);
         
         if(t.right != null)
            traverse(t.right,l);
         
         l.add(t.right);
        
     } 
    
}