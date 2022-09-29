class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> li = new ArrayList<Integer>();  
        int lowIndex=0;
        int highIndex=arr.length-1;
        
        while(highIndex-lowIndex >= k){
            
            int l = Math.abs(arr[lowIndex]-x);
            int h = Math.abs(arr[highIndex]-x);
            
            if(l <= h)
                highIndex--;
            else 
                lowIndex++;
            
        }
        
        while(lowIndex <= highIndex){
            li.add(arr[lowIndex++]);
        }

        return li;
    }
}