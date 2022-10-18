/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
/*
class Solution {
    public Node connect(Node root) {
         if(root==null)
            return root;
        
        root.next=null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(q.size()!=0){
            int n = q.size();
            for (int i=0 ; i<n ;i++){
                Node r = q.poll();
                if(i+1 == n )
                    r.next=null;
                else
                   r.next = q.peek();
                
                if(r.left!=null)
                    q.offer(r.left);
                if(r.right!=null)
                    q.offer(r.right);   
            }     
        }
       return root;
    }
}
*/


//sol2 : DFS - recursive
class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        
        if(root.left!=null ){
            if(root.right != null) 
                root.left.next = root.right;
            else
                root.left.next = findRightNode(root.next);
        }
        
        if(root.right!=null && root.next!=null)
            root.right.next = findRightNode(root.next);
        
        connect(root.right);
        connect(root.left);
        return root;
    }
    
    public Node findRightNode(Node root) {
        Node temp = root;
        while(temp != null) {
            if(temp.left == null && temp.right == null) {
                temp = temp.next;
            }
            else{
                if(temp.left != null) return temp.left;
                if(temp.right != null) return temp.right;
            }
        }
        return null;
    }
    
}









