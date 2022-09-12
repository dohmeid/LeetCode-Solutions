/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Set<Integer> hashSet = new HashSet<Integer>(); 
    public List<Node> vis = new ArrayList<Node>();
    
    public Node cloneGraph(Node node) {
        
        if(node == null)
            return null;
 
        Node n = new Node(node.val);
        hashSet.add(n.val);
        vis.add(n);
        
        for(Node nn : node.neighbors){
             
            if (!hashSet.contains(nn.val)){
                Node c = cloneGraph(nn);
                n.neighbors.add(c);
            }
            else{
                for(Node nv: vis){
                    if(nv.val == nn.val){
                        n.neighbors.add(nv);
                        break;
                    }
                }
                
            }
            
        }
        
        return n;
    }
}