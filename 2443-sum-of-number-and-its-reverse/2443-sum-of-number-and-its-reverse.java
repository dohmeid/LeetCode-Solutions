class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=num/2;i<=num;i++){
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


/* to reverse an int - convert it to string builder and reverse the string then convert it to int
int num;
String n = Integer.toString(num);
StringBuilder sb = new StringBuilder(n);
String rev = sb.reverse().toString();
int rev = Integer.parseInt(rev);

*/