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

/*sol1 : BFS using queue
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
}*/

//sol2 : DFS - recursive
class Solution {
    public Node connect(Node root) { // considering that root's next = null
        if(root==null)
            return root;
        if(root.left!=null)
            root.left.next = root.right;
        if(root.right!=null && root.next!=null )
            root.right.next = root.next.left;
        
        connect(root.left);
        connect(root.right);
        return root;
    }
}












