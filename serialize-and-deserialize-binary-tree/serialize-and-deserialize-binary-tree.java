/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec { //BFS
    
    public String serialize(TreeNode root) {  // Encodes a tree to a single string. 
        if(root==null)
            return "";
        
        String res = "";
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(q.size()!=0){
            int s = q.size();
            for(int i=0 ;i<s ; i++){
                TreeNode curr = q.poll();
                if(curr==null)
                     res = res + String.valueOf(5000) + " ";  //5000 = null
                else{
                    res = res + String.valueOf(curr.val) + " ";
                    if(curr.left!=null)
                        q.offer(curr.left);
                    else 
                        q.offer(null); //5000 = null

                    if(curr.right!=null)
                        q.offer(curr.right);
                    else
                          q.offer(null);//5000 = null
                }
            }
        }
        return res;
    }

    public TreeNode deserialize(String data) { // Decodes your encoded data to tree.
        if(data=="")
            return null;
        
        String str[] = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        q.offer(root);
        
        int i=1;
        while(i<str.length){
             TreeNode curr = q.poll();
                if(i%2!=0){ //odd - then left
                    if(Integer.parseInt(str[i])==5000)
                        curr.left = null;
                    else{
                        curr.left = new TreeNode(Integer.parseInt(str[i]));
                        q.offer(curr.left);   
                    }
                }
                i++; //even - right
                if(Integer.parseInt(str[i])==5000)
                    curr.right = null;
                else{
                    curr.right = new TreeNode(Integer.parseInt(str[i]));
                    q.offer(curr.right);   
                }
                
            i++;
    }
        
       return root; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));