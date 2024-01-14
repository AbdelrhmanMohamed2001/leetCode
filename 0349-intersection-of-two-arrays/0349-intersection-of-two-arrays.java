class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> one= new HashSet<>();
        HashSet<Integer> two= new HashSet<>();

        for (int i : nums1){
            one.add(i);
        }
        for (int i : nums2){
            two.add(i);
        }

        ArrayList<Integer> resultList= new ArrayList<>();
        for (int num : one){
            if (two.contains(num)){
                resultList.add(num);
            }
        }
        int result [] = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i]= resultList.get(i);
        }
        return  result;
    }
}