class Solution {
    public static boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num%2 !=0){
            return false;
        }

        for (int i = 1; i<num; i++) {
            if (num%i==0){
                sum+=i;
            }
           

        }
        if (sum==num){
            return true;
        }
        else
            return false;

    }
}