class Solution {
    public int largestPerimeter(int[] nums) {
     
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=n-1; i>=2; i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if((a+b)>c && (a+c)>b && (b+c)>a) //to check if it is impossible to form any triangle of a non-zero area, return 0
                return a+b+c;
        }
        return 0;
    }
}