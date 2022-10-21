class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();  
        for(int i=0 ; i<nums.length;i++){
            int n = nums[i];
            set.add(n);
            int rev = 0;
            while(n>0){
                int rem = n%10;
                rev = rev*10 + rem;
                n = n/10;
            }
            set.add(rev);  
        }
        return set.size();
    }
}
