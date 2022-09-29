class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int res=0;
       
        /* sol1
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i] && i<j)
                    res++;
            }
        }
        */
        
        //sol2
        HashMap<Integer, Integer> h = new HashMap<>(); //key is the number , value is the frequancy
         for(int n : nums){
            if(!h.containsKey(n)) {
                h.put(n, 0);
            }
             else{
                 int count = h.get(n);
                 h.put(n, ++count);
                 res += count;
             }

             
             
         }
        
        return res;
    }
}