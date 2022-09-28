class Solution {
    public int minimumSum(int num) {
        int [] ar = new int[4];
        int i=0;
        while(num>0){
            ar[i++] = num%10;
            num = num/10;
        }
        Arrays.sort(ar);
        
        String n1 = Integer.toString(ar[0]);
        String n2 = Integer.toString(ar[1]);
        String n3 = Integer.toString(ar[2]);
        String n4 = Integer.toString(ar[3]);
        
        String num1 = n1 + n3;
        String num2 = n2 + n4;
        
        return Integer.parseInt(num1)+Integer.parseInt(num2);
    }
}