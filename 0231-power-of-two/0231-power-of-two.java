class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if (n<1)
            return false;
        else {
            for (int i = 0; i < n; i++) {
                if (Math.pow(2,i)==n)
                    return true;
                if (Math.pow(2,i)>n)
                    return false;

            }
        }
        return false;


    }
}