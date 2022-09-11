class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        if(len<=1)
            return null;
        
        int[] ans = new int[len];
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<len;i++ ){
           
            //while stack has indices and the current temp is larger than the last temp in the stack
            while(s.size()>0 && temperatures[i]>temperatures[s.peek()]) 
                ans[s.peek()] = i-s.pop(); //add ans[i] to all previous temps in the stack
        
            s.push(i); //add index of the day to the stack
            
        }
        
        return ans;
    }
}