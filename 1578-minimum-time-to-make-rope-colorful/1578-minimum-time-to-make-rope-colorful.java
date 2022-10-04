class Solution {
    public int minCost(String c, int[] t) {
    
        /* solution1: time limit exceeded - high time complexity
        int res=0;
        int i=0;
        List<Integer> l = IntStream.of(t).boxed().collect(Collectors.toCollection(ArrayList::new));
        
        while(i<c.length()-1){
            char c1 = c.charAt(i);
            char c2 = c.charAt(i+1);
            
            if(c1==c2 && l.get(i) <= l.get(i+1) )
                    res += l.get(i); 
            else if(c1==c2 && l.get(i)>l.get(i+1)) {
                res+= l.get(i+1);
                c = c.substring(0,i) + c.substring(i+1); //remove i+1 char
                l.remove(i+1); //update array
                continue;
            }
            i++;    
        }
        return res;
        */
        
        //solution2: less time complexity
        int res=0, i=0;
        while(i<c.length()-1){
            int j=0;
            List<Integer> l = new ArrayList<Integer>();
            l.add(t[i]);
            for(j=i+1; j<c.length();j++){
                if(c.charAt(i)==c.charAt(j))
                    l.add(t[j]);  
                else
                    break;  
            }
            if(l.size()>1){
             Collections.sort(l); 
            int k=0;
            while(k<l.size()-1)
                res += l.get(k++);   
            }   
               i=j; 
        }
        
        return res;
        
    }
}