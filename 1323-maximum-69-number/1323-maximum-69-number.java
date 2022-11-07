/*
class Solution {
    public int maximum69Number (int num) {
        
        String n = Integer.toString(num);
        for(int i=0; i<n.length();i++){
            
             if(n.charAt(i)=='6'){
                n = n.substring(0, i) + '9' + n.substring(i + 1);
                return Integer.valueOf(n);   
             }
            
        }

        return num;
    }
}*/

class Solution {
    public int maximum69Number (int num) {
        
        char ar[] = String.valueOf(num).toCharArray(); 
        
        for(int i=0; i<ar.length;i++){  
             if(ar[i]=='6'){
                ar[i]='9';
                return Integer.valueOf(new String(ar));   
             }
            
        }

        return num;
    }
}