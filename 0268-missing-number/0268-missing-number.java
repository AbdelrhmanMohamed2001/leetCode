class Solution {
    public static int missingNumber(int[] nums) {
        
        int[] new_nums = new int[nums.length+1];
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < nums.length; i++) {
            sum1=sum1+nums[i];
        }


        for (int i = 0; i < new_nums.length; i++) {
            new_nums[i] = i;
            sum2= sum2+new_nums[i];

        }


        return sum2-sum1;

    }

}