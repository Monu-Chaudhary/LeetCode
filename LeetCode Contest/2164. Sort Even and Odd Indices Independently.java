class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length, temp = 0, flag = 1, i, j;
        if (len <= 2) return nums;
        while (flag != 0) {
            flag = 0;
            for (i=2, j=3; i< len && j<len; i=i+2, j=j+2){
                if (nums[i] < nums[i-2]) {
                    temp = nums[i];
                    nums[i] = nums[i - 2];
                    nums[i-2] = temp;
                    flag = 1;
                }
                if (nums[j] > nums[j-2]) {
                    temp = nums[j];
                    nums[j] = nums[j - 2];
                    nums[j-2] = temp;
                    flag = 1;
                }
            }
            if (i < len && nums[i] < nums[i-2]) {
                temp = nums[i];
                nums[i] = nums[i - 2];
                nums[i-2] = temp;
                flag = 1;
            }
            if (j < len && nums[j] > nums[j-2]) {
                temp = nums[j];
                nums[j] = nums[j - 2];
                nums[j-2] = temp;
                flag = 1;
            }
        }
        return nums;
    }
}