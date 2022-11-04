class Solution {
    public String reverseVowels(String s) {
        
        int start = 0;
        int end = s.length()-1;
        String vowels = "aeiouAEIOU";
        
        while(end > start){ //using 2 pointers
            char c1 = s.charAt(start);
            char c2 = s.charAt(end);
            
            if(vowels.indexOf(c1)==-1)
                start++;
            else if(vowels.indexOf(c2)==-1)
                end--;
            else{ //both vowels - switch //(vowels.indexOf(c1)!=-1 && vowels.indexOf(c2)!=-1)
                s = s.substring(0, start) + c2 + s.substring(start + 1);
                s = s.substring(0, end) + c1 + s.substring(end + 1);
                start++;
                end--;
            }
        }
        return s;
    }
}