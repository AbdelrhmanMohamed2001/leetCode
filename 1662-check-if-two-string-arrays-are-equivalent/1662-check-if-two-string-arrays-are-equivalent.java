class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1= "", result2="";
        for (String word_1 : word1){

            result1= result1 + word_1;
        }
        System.out.println(result1);

        for (String word_2 : word2){
            result2= result2 + word_2;
        }
        System.out.println(result2);

        if (result1.equals(result2)) {
            return true;
        } else
            return false;

    }

}