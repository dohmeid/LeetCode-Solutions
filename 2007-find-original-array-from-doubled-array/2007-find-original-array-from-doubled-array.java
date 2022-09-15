class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        if(changed.length <= 1 || changed.length%2!=0)
             return new int [0];
        
        Arrays.sort(changed);
        int [] org = new int[changed.length/2];
        Queue<Integer> q = new LinkedList<>();
                
        int j=0;
        for(int i=0 ; i<changed.length ; i++){
            int num = changed[i];
            
               if(!q.isEmpty() && q.peek()==num)
                    org[j++] = q.poll()/2;
               else
                   q.add(num*2);
           }
            
        if(q.size() != 0)
          return new int [0];
        else
            return org;
        }
            
}