class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<=num;i++){
            int n = i;
            //to reverse n
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            int rev = Integer.parseInt(sb.reverse().toString());
            if(n+rev==num)
                return true;
        }
         return false ;   
    }
}