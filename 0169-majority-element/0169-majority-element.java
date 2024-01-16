class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementcount = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            elementcount.put(nums[i], elementcount.getOrDefault(nums[i], 0) + 1);

        }

        for (Map.Entry<Integer,Integer> count : elementcount.entrySet()){
            if (count.getValue()>nums.length/2){
                return count.getKey();
            }

        }
        return 0;

    }
}