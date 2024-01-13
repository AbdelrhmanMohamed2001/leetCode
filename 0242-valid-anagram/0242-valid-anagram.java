class Solution {
    public static boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();


        char[] sLetters= s.toCharArray();
        char[] tLetters= t.toCharArray();

        Arrays.sort(sLetters);
        Arrays.sort(tLetters);

        return Arrays.equals(sLetters,tLetters);

    }
}