class Solution {
        public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int index= s.charAt(i);
            if(i==s.indexOf(index) && i==s.lastIndexOf(index))
                return i;
        }
        
        return -1;

        }
}