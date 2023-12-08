class Solution {
 public static int lengthOfLastWord(String s) {
        //removes whitespace from both ends of a string if any
        s = s.trim();
        
        int length = 0;
        int lastChar = s.length() - 1;
        
        // Iterate from the end of the string
        while (lastChar >= 0 && s.charAt(lastChar) != ' ') {
            length++;
            lastChar--;
        }
        
        return length;
    }
}