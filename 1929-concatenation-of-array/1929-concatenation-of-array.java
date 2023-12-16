class Solution {
    public static int[] getConcatenation(int[] nums) {
        int nums_size= nums.length;
        int [] res= new int[2*nums_size];
        for (int i=0; i<nums_size; i++){
            res[i]=nums[i];
            res[i+nums_size]=nums[i];

        }
        return res;
    }
}