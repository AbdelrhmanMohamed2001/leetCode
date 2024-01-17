class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);

        int i = 0;
        int j = 0;
        while (i < r.length && j < m.length) {
            if (r[i] == m[j]) {
                i++;
                j++;
            }
            else {
                j++;
            }

        }
        return i== r.length;
    }
}