import java.io.*;
import java.util.Arrays;
import java.util.Stack;

//Trace

/*nums= [0,0,1,1,1,2,2,3,3,4]
i=0, j=1  num[i]=0     num[j]=0   exit
i=0, j=2  num[i]=0     num[j]=1
i=1, j=3  num[i]=1      num[j]=1   exit
i=1, j=4  num[i]=1      num[j]=1   exit
i=1, j=5  num[i]=1      num[j]=2
i=2, j=6  num[i]=2      num[j]=2    exit
i=2, j=7  num[i]=2      num[j]=3
i=3, j=8  num[i]=3      num[j]=3    exit
i=3, j=9  num[i]=3      num[j]=4
i=4, j=0  num[i]=      num[j]=
*/
 
class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0;
        for (int j = i+1; j < nums.length; j++) {
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }






/*
USING SET DATA STRUCTURE
set data strucure that contains only unique and sorted values
new array with size index
طول ما الرقم مش موجود هضيفه في السيت و في الاراي الجديد 
 */

   class Solution {
    public static int removeDuplicates(int[] nums){
        Set<Integer> hashset= new HashSet<>();
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (!hashset.contains(nums[i])){
                hashset.add(nums[i]);
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
        }
    
}


