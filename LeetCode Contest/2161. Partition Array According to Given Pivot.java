class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0,j=-1,k=-1, m=0, count = 0;
        int[] part = new int[nums.length];
        while(i<=nums.length -1) {
            if (nums[i] < pivot) {
                part[m++] = nums[i];
            }
            else if (nums[i] == pivot) {
                count++;
                j = i;
            }
            else if(nums[i] > pivot && k ==-1 ) {
                k = i;
            }
            i++;
        }
        while(count > 0) {
            part[m++] = nums[j];
            count --;
        }
        while (k >=0 && k <= nums.length -1) {
            if (nums[k] > pivot) {
                part[m++] = nums[k];
            }
            k++;
        }
        return part;
    }
}