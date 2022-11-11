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