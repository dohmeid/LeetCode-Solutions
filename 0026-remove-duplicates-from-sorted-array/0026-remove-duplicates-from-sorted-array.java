class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[k] = nums[i+1];
                k++;
            }
        }
        return k;
    }
}



/*
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();  
        for(int i: nums)
            set.add(i);
        
        //to sort set, because sets are randomly ordered
        TreeSet<Integer> ts = new TreeSet<Integer>(set); // convert to TreeSet
        Iterator<Integer> ascSorting = ts.iterator();  // Iterating using Iterator
        int j=0;
        while(ascSorting.hasNext()) {
            nums[j++] = ascSorting.next();
        }
        
        return set.size();
    }
}
*/