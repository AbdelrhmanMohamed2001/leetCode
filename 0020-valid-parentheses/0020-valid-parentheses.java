class Solution {
     public static <character> boolean isValid(String s) {  //{}()
        Stack <Character> Brackets= new Stack<>();
        for(char i : s.toCharArray()){//loop in all characters in the string s
            if(i=='(')
                Brackets.push(')');
            else if(i=='{')
                Brackets.push('}');
            else if(i=='[')
                Brackets.push(']');

            else if (Brackets.isEmpty()) //check that stack not empty
                return false;
            else if (Brackets.pop()!=i)
                return false;

        }
        return Brackets.isEmpty();
    }
     public static void main (String[]args){

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        

        }
} 
    
