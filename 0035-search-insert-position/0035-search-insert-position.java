class Solution {
      public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target)
                return i;
        }

        int lastIndex=0;

        while (lastIndex<nums.length && nums[lastIndex]<target){
            lastIndex++;
        }

        int [] new_Nums= new int[nums.length+1];
        for (int i = 0; i < lastIndex; i++) {
            new_Nums[i]=nums[i];
        }
        for (int i = 0; i < new_Nums.length; i++) {
            if (target==new_Nums[i])
                return i;
        }

        return lastIndex;

    }
}