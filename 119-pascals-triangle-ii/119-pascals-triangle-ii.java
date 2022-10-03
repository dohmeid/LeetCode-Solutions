class Solution {
    public List<Integer> getRow(int rowIndex) {
        
    /* solution 1 : iterative     
        int n = rowIndex;
        ArrayList<List<Integer>> l = new ArrayList<List<Integer>>();
        int r=0 , c=0 ;
        while(rowIndex>=0){
            
            List<Integer> l2 = new ArrayList<Integer>();
            for(int i=0; i<c+1; i++){
                if(i==0 || i==r)
                    l2.add(1);
                else{
                    List<Integer> l3 = l.get(r-1);
                    int sum = l3.get(i) + l3.get(i-1);
                    l2.add(sum);
                }
            }
            
            l.add(l2);
            c++;
            r++;
            rowIndex--;
        }
     
        return l.get(n);
        */
        
        //solution2: recursive
        
        if(rowIndex==0)
            return Arrays.asList(1);
        if(rowIndex==1)    
            return Arrays.asList(1,1);
        
        List<Integer> prev = getRow(rowIndex-1);
        List<Integer> curr = new ArrayList<Integer>();
        curr.add(1);
        for(int i=1; i<prev.size();i++)
            curr.add( prev.get(i) + prev.get(i-1) );
        curr.add(1);    
        return curr;
    }
    
}