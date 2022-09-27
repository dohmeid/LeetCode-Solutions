class Solution {
    public String defangIPaddr(String a) {
       /* String res="";
        for(int i=0 ; i<a.length();i++){
            if(a.charAt(i)!='.')
                res += a.charAt(i);
            else
                res += "[.]";
        }*/
        
        String res = a.replace(".","[.]");
    
        return res;
    }
}