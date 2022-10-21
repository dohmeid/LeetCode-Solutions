class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<=num;i++){
            set.add(i+Integer.parseInt(new StringBuilder(Integer.toString(i)).reverse().toString()));
        }
         return set.contains(num);
        
        
    }
}