class Solution {
    public static int addDigits(int num) {

        if (num < 10) {
            return num;
        }

        int sum = 0;
        String strNum = Integer.toString(num);

        for (int i = 0; i < strNum.length(); i++) {
            int digit = Character.getNumericValue(strNum.charAt(i));
            sum += digit;
        }

        return addDigits(sum);
    }
}