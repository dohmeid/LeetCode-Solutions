//solution1 : 
class Solution {
    public String intToRoman(int num) {   
        HashMap<Integer, String> map = new HashMap<>();
        //add general cases
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        //add special cases  
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
        
        String res = "";  
        int[] temp = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        for(int i=0; i<temp.length; i++){
            while(num >= temp[i]){
            res += map.get(temp[i]);
            num -= temp[i];
          }
        }
       
        return res;
    }
    
}




/* solution2: 
class Solution {
    public String intToRoman(int num) {    
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(200,"CC");
        map.put(300,"CCC");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(600,"DC");
        map.put(700,"DCC");
        map.put(800,"DCCC");
        map.put(900,"CM");
        map.put(1000,"M");
        map.put(2000,"MM");
        map.put(3000,"MMM");
        
    String res = "";    
    int temp = 1000;
    
    while(num>0){
        
        int n = num%temp;
        num = num -n;
        if(map.get(num) != null)
            res += map.get(num);
        temp /= 10;
        num = n;
        
    }    
         
        return res;
    }
}*/

