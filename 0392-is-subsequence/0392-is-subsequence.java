class Solution {
   public static boolean isSubsequence(String s, String t) {

        s.toLowerCase();
        t.toLowerCase();
        int i=0;
        int j=0;


        while (i<s.length() && j<t.length()){
            if (s.toCharArray()[i]==t.toCharArray()[j]){
                i++;
                j++;
            }
            else {
                j++;
            }
            
        }
        

        return (i==s.length());

    }
}