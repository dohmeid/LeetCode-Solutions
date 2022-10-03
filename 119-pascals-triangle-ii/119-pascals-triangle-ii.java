class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        
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
    }
    
}