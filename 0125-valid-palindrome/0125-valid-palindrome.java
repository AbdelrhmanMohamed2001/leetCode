class Solution {
    public static boolean isPalindrome(String s) {
        s=s.trim();
        s=s.replace(":","");
        s=s.replace(", ","");
        s=s.replace(" ", "");
        s=s.replace(".", "");
        s=s.replace("!", "");
        s=s.replace("?", "");
        s=s.replace("@", "");
        s=s.replace("#", "");
        s=s.replace("$", "");
        s=s.replace("%", "");
        s=s.replace("&", "");
        s=s.replace("*", "");
        s=s.replace("-", "");
        s=s.replace("+", "");
        s=s.replace("_", "");
        s=s.replace("=", "");
        s=s.replace("(", "");
        s=s.replace(")", "");
        s=s.replace("{", "");
        s=s.replace("}", "");
        s=s.replace("[", "");
        s=s.replace("]", "");
        s=s.replace("''", "");
        s=s.replace("\"\"", "");
        s=s.replace("'", "");
        s=s.replace("\\", "");
        s=s.replace("/", "");
        s=s.replaceAll("[^a-zA-Z0-9\\s]", "");
        
        s=s.toLowerCase();

        int left=0;
        int right=s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }


        return true;


    }
}