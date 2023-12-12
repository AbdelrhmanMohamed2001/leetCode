/*
Input: s = "leetcode"  l-0 && 0-?-->0
Output: 0

Input: s = "loveleetcode"  l,0,4// o,1,9// v,2,2
Output: 2

charAt--> returns the character at the specified index in a string
indexOf--> returns the position of the first occurrence of character(s) in a string
lastIndexOf--> return the position of the last occurrence of character(s) in a string
 */

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
