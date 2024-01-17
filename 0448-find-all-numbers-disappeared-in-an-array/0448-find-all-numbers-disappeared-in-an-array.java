class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer>setNums= new HashSet<>();
        List<Integer> disappearedNumbers = new ArrayList<>();

        for (int k = 1; k <= nums.length; k++) {
            disappearedNumbers.add(k);
        }

        for (int g = 0; g < nums.length; g++) {
            setNums.add(nums[g]);
        }



        disappearedNumbers.removeAll(setNums);

        return disappearedNumbers;

    }
}